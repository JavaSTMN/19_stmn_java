package tp;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.invoke.WrongMethodTypeException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class tpTEST {
	int[] leInt;
	int[][] firstMatrix;
	int[][] awaitedResult;
	int[][] wrongResult;

	
	@BeforeEach
	void setUp() throws Exception {
		leInt = new int[]{5,5,5,5,5};
		firstMatrix = new int[][]{{
				1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5}
		};
		awaitedResult = new int[][] {
			{15,30,45,60,75},
			{15,30,45,60,75},
			{15,30,45,60,75},
			{15,30,45,60,75},
			{15,30,45,60,75}
		};
		
		wrongResult = new int[][] {
			{15,30,45,60,75},
			{15,30,15,60,75},
			{15,30,41,60,75},
			{15,30,15,60,75},
			{15,30,65,60,75}
		};
	
	}

	@AfterEach
	void tearDown() throws Exception {
		leInt = null;
		firstMatrix = null;
		awaitedResult = null;
	}


	@Test
	void meanTest() throws Exception {
		assertEquals(5.0 ,tp.mean(leInt));
	}
	
	@Test
	void meanTestError() throws Exception{
		assertNotEquals(25.2, tp.mean(leInt));
	}
	
	@Test
	void multiplicationTest() {
		assertArrayEquals(awaitedResult,tp.multiply(firstMatrix, firstMatrix));
	}

	@Test
	void multiplicationFailedTest() {
		assertNotEquals(wrongResult,tp.multiply(firstMatrix, firstMatrix));
	}
	
}
