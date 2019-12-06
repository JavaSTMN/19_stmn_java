package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void normTest() {
		// init 
		double[] v = {4f, 5f};
		double expected = Math.sqrt(41f);
		
		// execute
		double result = Vector.norm(v);
		
		// test
		assertEquals(expected, result);		//assertArrayEquals(expected, result);
	}
	
	@Test
	void scaleTest() {
		// init 
		double[] v = {2f, 3f};
		double k = 4;
		double[] expected = {8f, 12f};
		
		// execute
		double[] result = Vector.scale(v, k);
		
		// test
		assertArrayEquals(expected, result);		
	}
	
	@Test
	void normalizeTest() {
		// init 
		double[] v = {4f, 5f};
		double[] expected = {4f/Math.sqrt(41f), 5f/Math.sqrt(41f)};
		
		// execute
		double[] result = Vector.normalize(v);
		
		// test
		assertArrayEquals(expected, result);		
	}
	
	@Test
	void addTest() {
		// init 
		double[] v1 = {4f, 5f};
		double[] v2 = {6f, 5f};
		double[] expected = {10f, 10f};
		
		// execute
		double[] result = Vector.add(v1, v2);
		
		// test
		assertArrayEquals(expected, result);		
	}
	
}
