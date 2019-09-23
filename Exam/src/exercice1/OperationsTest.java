package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperationsTest {

	@Test
	void testSumOfCube() throws Exception {
		int n = 10;
		int sum = Operations.sumOfCube(n);
		assertEquals(sum, 3025);
	}
	
	@Test
	void testCubeOfSum() throws Exception {
		int n = 10;
		int sum = Operations.cubeOfSum(n);
		assertEquals(sum, 166375);
	}
	
	@Test
	void testDifference() throws Exception {
		int sum = Operations.cubeOfSum(100);
		int cube = Operations.sumOfCube(100);
		assertEquals(cube - sum, 86896380);
	}

}
