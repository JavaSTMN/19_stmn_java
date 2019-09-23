package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberTest {

	@Test
	void nToCubeTest() {
		int n = 10;
		int solved = PrimeNumber.nToCube(n);
		assertEquals(3025,solved);
	}
	
	@Test
	void nSumToCubeTest() {
		int n = 10;
		int solved = PrimeNumber.nSumToCube(n);
		assertEquals(166375,solved);
	}
	
	@Test
	void diffTest() {
		int n = 10;
		int solved = PrimeNumber.diff(n);
		assertEquals(163350,solved);
		
	}

}
