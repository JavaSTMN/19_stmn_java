import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemindersTest {
	
	float[] numbers;

	@Test
	void meanTest() throws Exception {
		numbers = new float[] { 1, 2, 3, 5, 7 };
		float expected = (1 + 2 + 3 + 5 + 7) / 5;
		assertEquals(expected, Reminders.mean(numbers));
	}
	
	@Test
	void meanTestNotEqual() throws Exception {
		numbers = new float[] { 1, 2, 3, 5, 7 };
		assertNotEquals(25.0, Reminders.mean(numbers));
	}
}
