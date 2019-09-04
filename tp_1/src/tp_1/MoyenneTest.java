package tp_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoyenneTest {

	/**
	 * Test the mean function with a list of double
	 * @throws Exception
	 */
	@Test
	void testMean() throws Exception{
		double numbers[] = {1,2,3,4,5};
		assertEquals(3.0, Moyenne.mean(numbers));
	}
	
	/**
	 * Test the exception
	 * @throws Exception
	 */
	@Test
	void testMeanException() throws Exception{
		double numbers[] = null;
		assertThrows(Exception.class, ()->{Moyenne.mean(numbers);});
	}

}
