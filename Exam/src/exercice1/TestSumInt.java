package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSumInt {

	@Test
	void testSumSquare() {
		int limit = 10;
		int result = SumInt.sumSquare(limit);
		int expected = 385;
		assertEquals(expected, result);
	}
	
	@Test
	void testSquareSum() {
		int limit = 10;
		int result = SumInt.squareSum(limit);
		int expected = 3025;
		assertEquals(expected, result);
	}
	
	@Test
	void testDifference() {
		int result = SumInt.difference();
		int expected = 25164150;
		assertEquals(expected, result);
	}
	
	@Test
	void testSumSquareNotWorks() {
		int limit = 10;
		int result = SumInt.sumSquare(limit);
		assertNotEquals(10, result);
	}
	
	@Test
	void testSquareSumNotWorks() {
		int limit = 10;
		int result = SumInt.squareSum(limit);
		assertNotEquals(10, result);
	}
	
	@Test
	void testDifferenceNotWorks() {
		int result = SumInt.difference();
		assertNotEquals(10, result);
	}

}
