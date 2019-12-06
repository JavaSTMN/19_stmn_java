package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void NormTest() {
		Vector v = new Vector(1.0,2.0);
		double expected = Math.sqrt(5);
		try {
			assertEquals(expected, v.norm());
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}
	
	@Test
	void ScaleTest() {
		Vector v = new Vector(1.0,2.0);
		Vector w = new Vector(2.0,4.0);
		Vector r = v.scale(2.0);
		
		double[] actualElements = new double[] {r.getVal0(),r.getVal1()};
		double[] expectedElements = new double[] {w.getVal0(), w.getVal1()};
		
		try {
			assertArrayEquals(expectedElements, actualElements);
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}
	
	@Test
	void NormalizeTest() {
		Vector v = new Vector(1.0,2.0);
		Vector w = new Vector(1.0/Math.sqrt(5),2.0/Math.sqrt(5));
		Vector r = v.normalize();
		
		double[] actualElements = new double[] {r.getVal0(),r.getVal1()};
		double[] expectedElements = new double[] {w.getVal0(), w.getVal1()};
		
		try {
			assertArrayEquals(expectedElements, actualElements);
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}
	
	@Test
	void AddTest() {
		Vector v = new Vector(1.0,2.0);
		Vector w = new Vector(1.0,2.0);
		Vector r = Vector.add(v, w);
		Vector e = new Vector(2.0,4.0);
		
		double[] actualElements = new double[] {r.getVal0(),r.getVal1()};
		double[] expectedElements = new double[] {e.getVal0(), e.getVal1()};
		
		try {
			assertArrayEquals(expectedElements, actualElements);
		} catch (Exception err) {
			fail("Test should not throw");
		}
	}

}
