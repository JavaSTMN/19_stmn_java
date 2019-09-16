import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mainTest {

	@Test 
	void Working() throws Exception {
		int[][] a = {{10,10,5},{20,20,5}};
		int[][] b = {{10,10},{20,20},{5,5}};
		int[][] expected = {{325,325},{625,625}};
		
		assertArrayEquals(expected,main.mult(a,b)); 
	}

	@Test
	void ArrayNull() throws Exception {
		int[][] a = {{},{}};
		int[][] b = {{10,10},{20,20},{5,5}};
		assertThrows(Exception.class, () -> {main.mult(a,b);});
	}
	
	@Test
	void FalseSize() throws Exception {
		int[][] a = {{10,10,5,4},{20,20,5,7}};
		int[][] b = {{10,10},{20,20},{5,5}};
		assertThrows(Exception.class, () -> {main.mult(a,b);});
	}

}
