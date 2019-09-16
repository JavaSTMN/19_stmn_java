import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mainTest {

	@Test
	void moyTestWorking() throws Exception {
		double[] numbers = {10,10,20,20};
		double expected = 15;
		assertEquals(expected,main.moy(numbers));
	}

	@Test
	void moyTestExceptions() throws Exception {
		double[] numbers = {};
		assertThrows(Exception.class, () -> {main.moy(numbers);});
	}
}
