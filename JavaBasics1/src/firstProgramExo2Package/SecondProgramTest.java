package firstProgramExo2Package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecondProgramTest {

	@Test
	void multiplyTestNominal() throws Exception {
		int[][] A = {{ 2, 3, 5 }, 
			     	 { 4, 5, 6 }, 
			     	 { 5, 6, 7 }}; // 3x3
		
		int[][] B = {{ 9, 1, 1 }, 
					 { 5, 5, 2 }, 
					 { 8, 4, 2 }}; // 3x3
	
		int[][] C = {{ 73, 37, 18 }, 
					 { 109, 53, 26 }, 
					 { 131, 63, 31 }}; // 3x3
		
		assertArrayEquals(SecondProgram.multiply(A, B), C);
	}
	
	@Test
	void multiplyTestThrow() throws Exception {
		int[][] A = {{ 2, 3, 5 }, 
		     	     { 4, 5, 6 }, 
		     	     { 5, 6, 7 }}; // 3x3
		
		int[][] D = {{ 8, 1, 4 }, 
					 { 2, 7, 9 }}; // 2x3
		
		assertThrows(Exception.class, () -> { SecondProgram.multiply(A, D); });
	}

}
