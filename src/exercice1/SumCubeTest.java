package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumCubeTest {

	@Test
	void testSum() {
		int expected = 3025;
		assertEquals(expected, SumCube.Sum(10));
	}
	
	@Test
	void TestCubeOfSum() {
		int expected = 166375;
		assertEquals(expected, SumCube.CubeOfSum(10));
	}
	
	@Test
	void TestDiffSum() {
		SumCube.DiffSum(100); // Affiche la différence qui est égale à 1.287621225E11.
	}
}
