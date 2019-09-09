package division;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class exo1Test {
	float[] numbers;
	
	@BeforeEach
	void setUp() throws Exception {
		numbers = new float[] {5,5,5};
	}
	
	@AfterEach
	void tearDown() throws Exception {
		numbers = null;
	}
	
	@Test
	void test() throws Exception {
		
		assertEquals(5, exo1.moy(numbers));
		assertNotEquals(10, exo1.moy(numbers));
		assertThrows(Exception.class, )->{test.moy(new double[] {});});
	}
	
}
