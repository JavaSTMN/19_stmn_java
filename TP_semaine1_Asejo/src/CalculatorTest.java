import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	double[] myNumList = {15 , 5};

	@Test
	void test() {
		assertEquals(10.0, Calculator.mean(myNumList));
	}

	@Test
	void testException() {
		assertThrows(Exception.class, ()->{Calculator.meanException(new double[] {});});
		/*try {
			assertEquals("divided by 0", Calculator.meanException(myNullList));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
}
