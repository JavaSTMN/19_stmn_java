package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void normTest() throws Exception {
		double[] v = {1, 1};
		
		assertEquals(Math.sqrt(2), Vector.norm(v));
	}
	
	@Test
	void scaleTest() throws Exception {
		double[] v = {1, 1};
		double[] result = {2, 2};
		
		assertArrayEquals(result, Vector.scale(v, 2));
	}
	
	@Test
	void normalizeTest() throws Exception {
		double[] v = {2, 2};
		double[] result = {2/Vector.norm(v), 2/Vector.norm(v)};
		
		assertArrayEquals(result, Vector.normalize(v));
		
	}
	
	@Test
	void addTest() throws Exception {
		double[] v = {1, 1};
		double[] w = {1, 1};
		
		double[] result = {2,2};
		
		assertArrayEquals(result, Vector.add(v, w));
	}
	
	/* Pour des raisons de temps je fait le test d'exception seulement sur une fonction */
	@Test
	void scaleExceptionTest() throws Exception {
		double[] v = {};
		
		assertThrows(Exception.class, () -> {
			Vector.scale(v, 2);
		});
	}
	
	
	

}
