package division;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class exo1Test {
	float[] numbers;
	float[] emptyArray;
	
	@BeforeEach
	void setUp() throws Exception {
		numbers = new float[] {5,5,5};
		emptyArray = new float[] {};
	}
	
	@AfterEach
	void tearDown() throws Exception {
		numbers = null;
	}
	
	@Test
	void testDivException() throws Exception {		
		assertThrows(Exception.class, () ->{exo1.moy(emptyArray);});
	}
	
	@Test
	void testNotEqual() throws Exception {
		assertNotEquals(10, exo1.moy(numbers));
	}
	
	@Test
	void testNominal() throws Exception {
		assertEquals(5, exo1.moy(numbers));
	}
	
}
