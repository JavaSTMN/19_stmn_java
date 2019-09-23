package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NaturalIntegersTest {
	@Test
	void sumOfCubeFirstNaturalInt() {
		assertEquals(3025, NaturalIntegers.IntegersCubeSum(10));
	}
	
	@Test
	void cubeOfSumFirstNaturalInt() {
		assertEquals(166375, NaturalIntegers.IntergersSumCube(10));
	}

	@Test
	void differenceBetweenCubeOfSumAndSumOfCube() {
		assertEquals(163350, (NaturalIntegers.IntergersSumCube(10)-NaturalIntegers.IntegersCubeSum(10)));
	}
}
