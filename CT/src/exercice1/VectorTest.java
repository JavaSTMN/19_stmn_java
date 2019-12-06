package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void test() {
		double[] x = {1, 1};
		double[] w = {1, 1};
		
		
		Vector v = new Vector(x, w);
		
		// Test de la méthode Norm
		assertEquals(Math.sqrt(2), v.norm(x[0], x[1]));
	}
	
	@Test
	void testScale() {
		double[] x = {2, 4};
		double[] w = {4, 4};
		
		
		Vector v = new Vector(x, w);
		
		double[] expected = {6, 12};
		
		assertArrayEquals(expected, v.scale(3, x));
	}
	
	@Test
	void testNormalize() {
		double[] x = {1, 1};
		double[] w = {1, 1};
		
		Vector v = new Vector(x, w);
		double norm = v.norm(x[0], x[1]);
		
		double[] expected = {1/Math.sqrt(2), 1/Math.sqrt(2)};
		
		assertArrayEquals(expected, v.normalize(norm, x));
	}
	
	@Test
	void testAdd() {
		double[] x = {2, 4};
		double[] w = {4, 4};
		
		
		Vector v = new Vector(x, w);
		
		double[] expected = {6, 8};
		
		// Test de la méthode Norm
		assertArrayEquals(expected, v.add(x, w));
	}

}
