package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void testNorm() {
		Vector v = new Vector(1, 1);
		double expected = 1.4142135623730951;
		try {
			assertEquals(expected, v.norm());
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}
	
	@Test
	void testScale() {
		Vector v = new Vector(2, 3);
		int k = 5;
		Vector expected = new Vector(10, 15);
		try {
			assertEquals(expected.getVx(), v.scale(k).getVx());
			assertEquals(expected.getVy(), v.scale(k).getVy());
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}
	
	@Test
	void testNormalize() {
		Vector v = new Vector(3, 0);
		Vector expected = new Vector(1, 0);
		try {
			assertEquals(expected.getVx(), v.normalize().getVx());
			assertEquals(expected.getVy(), v.normalize().getVy());
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}
	
	@Test
	void testAdd() {
		Vector v = new Vector(3, 4);
		Vector w = new Vector(2, 5);
		Vector expected = new Vector(5, 9);
		try {
			assertEquals(expected.getVx(), v.add(w).getVx());
			assertEquals(expected.getVy(), v.add(w).getVy());
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}
}