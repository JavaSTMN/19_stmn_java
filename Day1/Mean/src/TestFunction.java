import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFunction {

	@Test
	void testEmpty() {
		Throwable exception = assertThrows(Exception.class, () -> {Function.mean(new double[] {});});
		assertEquals("Cannot compute mean of empty list", exception.getMessage());
	}

	@Test
	void test1Element() {
		double[] items = new double[] {1.5};
		double expected = 1.5;
		try {
			assertEquals(expected, Function.mean(items));
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}

	@Test
	void testNominal() {
		double[] items = new double[] {1.5, 3.2, 7.8};
		double expected = (1.5 + 3.2 + 7.8)/3.;
		try {
			assertEquals(expected, Function.mean(items));
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}

	@Test
	void testBigList() {
		double[] items = new double[100000];
		for (int i=0; i< items.length; ++i) {
			items[i] = i+1;
		}
		double expected = items.length*(items.length+1.)/(2*items.length);
		try {
			assertEquals(expected, Function.mean(items));
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}

}
