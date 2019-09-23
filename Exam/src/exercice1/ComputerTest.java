package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComputerTest {

	@Test
	void testSumSqrt() throws Exception {
		int resExpected = 385, n = 10;
		assertEquals(resExpected, Computer.sumSqrt(n));
		Throwable e = assertThrows(Exception.class, () -> { 
			Computer.sumSqrt(0);
		});
		assertEquals("Cannot calculte square of 0", e.getMessage());
	}
	
	@Test
	void testSqrtSum() throws Exception {
		int resExpected = 3025, n = 10;
		assertEquals(resExpected, Computer.sqrtSum(n));
		Throwable e = assertThrows(Exception.class, () -> { 
			Computer.sqrtSum(0);
		});
		assertEquals("Parameters n should be different of 0 and positif", e.getMessage());
	}
	
	@Test
	void testDiffSqrtSum() throws Exception {
		int diffExpected = 25164150;
		assertEquals(diffExpected, Computer.diffSqrtSum(100));
	}
	
}
