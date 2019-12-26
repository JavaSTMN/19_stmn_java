package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void testNorm() {
		Vector v = new Vector(3, 4);
		double expected = 5;
		assertEquals(expected, v.norm());
	}
	
	@Test
	void testScale() {
		Vector v = new Vector(3, 4);
		Vector expected = new Vector(6, 8);
		v.scale(2);
		assertEquals(expected, v);
	}
	
	@Test
	void testScaleCopy() {
		Vector v = new Vector(3, 4);
		Vector expected = new Vector(6, 8);
		assertEquals(expected, v.scaleCopy(2));
	}
	
	@Test
	void testNormalize() {
		Vector v = new Vector(3, 4);
		Vector expected = new Vector(3/5., 4/5.);
		v.normalize();
		assertEquals(expected, v);
		assertEquals(1., v.norm());
	}
	
	@Test
	void testNormalizeNull() {
		Vector v = new Vector(0, 0);
		Vector expected = new Vector(0, 0);
		v.normalizeCopy();
		assertEquals(expected, v);
	}
	
	@Test
	void testNormalizeCopy() {
		Vector v = new Vector(3, 4);
		Vector expected = new Vector(3/5., 4/5.);
		Vector actual = v.normalizeCopy();
		assertEquals(expected, actual);
		assertEquals(1., actual.norm());
	}
	
	@Test
	void testNormalizeCopyNull() {
		Vector v = new Vector(0, 0);
		Vector expected = new Vector(0, 0);
		Vector actual = v.normalizeCopy();
		assertEquals(expected, actual);
	}
	
	@Test
	void testAddCopy() {
		Vector v = new Vector(3, 4);
		Vector u = new Vector(5, 6);
		Vector expected = new Vector(8, 10);
		assertEquals(expected, v.addCopy(u));
	}

}
