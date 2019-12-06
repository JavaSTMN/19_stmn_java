package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void testNorm(){		
		double[][] v = {{1},{1}};
		assertEquals(Math.abs(Math.sqrt(2)), Vector.norm(v));
	}
	
	@Test
	void testScale() {
		double[][] v = {{1},{1}};
		double k = 2;
		double[][] expected = {{2},{2}};
		assertArrayEquals(expected, Vector.scale(k, v));
	}
	
	@Test
	void testNormalize() {
		double[][] expected = {{1/Math.abs(Math.sqrt(2))}, {1/Math.abs(Math.sqrt(2))}};
		double[][] v = {{1},{1}};
		assertArrayEquals(expected, Vector.normalize(v));
	}
	
	@Test
	void testAdd() {
		double[][] expected = {{4},{3}};
		double[][] v = {{1},{1}};
		double[][] w = {{3}, {2}};
		assertArrayEquals(expected, Vector.add(v, w));
	}

}
