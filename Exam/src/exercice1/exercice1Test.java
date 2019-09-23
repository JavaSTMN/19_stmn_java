package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exercice1Test {

	@Test
	void testSumSquare() {
		int expected = 385;
		int n = 10;
		
		int actual = SumUtils.sumSquare(n);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testSquareSum() {
		int expected = 3025;
		int n = 10;
		
		int actual = SumUtils.squareSum(n);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testSubstraction() {
		int expected = 2640;
		int n = 10;
		
		int actual = SumUtils.subtraction(n);
		
		assertEquals(expected, actual);
	}

}
