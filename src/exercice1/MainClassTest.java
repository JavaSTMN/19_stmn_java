package exercice1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainClassTest {

	@Test
	void moyNominal() throws Exception{
		assertEquals(2.0, MainClass.moy(new double[]{1.0, 3.0}));
	}

	@Test
	void moyFail() throws Exception{
		assertNotEquals(1.0, MainClass.moy(new double[]{1.0, 3.0}));
	}
	
	@Test
	void moyException(){
		assertThrows(Exception.class, ()->{MainClass.moy(new double[] {});});
	}

	@Test
	void multiplyNominal() throws Exception{
		int[][] A = new int[][]{{1, 2, 3},{4, 5, 6}};
		int[][] B = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		int[][] C = new int[][]{{38, 44, 50, 56}, {83, 98, 113, 128}};
		assertArrayEquals(C, MainClass.multiply(A, B));
	}

	@Test
	void multiplyFail() throws Exception{
		int[][] A = new int[][]{{1, 2, 3},{4, 5, 6}};
		int[][] B = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		int[][] C = new int[][]{{3, 5, 8, 0}, {7, 8, 4, 5}};
		assertNotEquals(C, MainClass.multiply(A, B));
	}

	@Test
	void multiplyDimensionsMismatch(){
		int[][] A = new int[2][2];
		int[][] B = new int[3][3];
		assertThrows(Exception.class, ()->MainClass.multiply(A, B));
	}

	@Test
	void multiplyNullMatrixA(){
		int[][] A = new int[][]{{1, 2, 3},{4, 5, 6}};
		int[][] B = null;
		assertThrows(Exception.class, ()->{MainClass.multiply(A, B);});
	}

	@Test
	void multiplyNullMatrixB(){
		int[][] A = null;
		int[][] B = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		assertThrows(Exception.class, ()->{MainClass.multiply(A, B);});
	}
}
