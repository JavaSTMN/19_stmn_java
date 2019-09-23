package ex1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculs {

	@Test
	void testsumcub() {
		int n = 5;
		int result = -1;
		try {
			result = Calculs.sumcub(n);
		} catch (Exception e) {
			fail("sumcub exception");
		}
		int expected = 225;
		assertEquals (result, expected);
	}
	
	@Test
	void testcubsum() {
		int n = 5;
		int result = -1;
		try {
			result = Calculs.cubsum(n);
		} catch (Exception e) {
			fail("cubsum exception");
		}
		int expected = 3375;
		assertEquals (result, expected);
	}
	
	@Test
	void testdiff() {
		int n = 5;
		int result = -1;
		try {
			result = Calculs.difference(n);
		} catch (Exception e) {
			fail("difference exception");
		}
		int expected = -3150;
		assertEquals (result, expected);
	}
	
	@Test
	void questCinq() {
		int n = 100;
		int result = -1;
		try {
			result = Calculs.difference(n);
		} catch (Exception e) {
			fail("difference exception");
		}
		int expected = 86896380;
		assertEquals (result, expected);
	}
	
}
