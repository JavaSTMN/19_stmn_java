package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTests {

	@Test
	void calculatorSumOfCubesTest() throws Exception {
		// init
		int n = 0;
		int sum = 0;
		
		// exec
		int testValue = Calculator.sumOfCubes(n);
		
		// assert
		assertEquals(sum, testValue);
	}
	
	@Test
	void calculatorSumOfCubesThrowTest() throws Exception {
		// init
		int n = -5;
		
		assertThrows(Exception.class, () -> { Calculator.sumOfCubes(n); });
	}
	
	@Test
	void calculatorCubeOfSumTest() throws Exception {
		// init
		int n = 10;
		int cube = 166375;
		
		// exec
		int testValue = Calculator.cubeOfSum(n);
		
		// assert
		assertEquals(cube, testValue);
	}
	
	@Test
	void calculatorCubeOfSumThrowTest() throws Exception {
		// init
		int n = -5;
		
		assertThrows(Exception.class, () -> { Calculator.cubeOfSum(n); });
	}
	

	@Test
	void calculatorTestDifference1() throws Exception {

		// init
		int n = 10;
		int difference = 163350;
		
		// exec
		int a = Calculator.sumOfCubes(n);
		int b = Calculator.cubeOfSum(n);
		
		// assert
		assertEquals(difference, b - a);
	}
	
	@Test
	void calculatorTestDifference2() throws Exception {

		// init
		int n = 100;
		int difference = -86896380;
		
		// exec
		int a = Calculator.sumOfCubes(n);
		int b = Calculator.cubeOfSum(n);
		
		// assert
		assertEquals(difference, b - a);
	}

}
