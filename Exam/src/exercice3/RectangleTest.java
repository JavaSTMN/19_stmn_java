package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void test() {
		Rectangle rect = new Rectangle(2,4);
		
		double expected = 2 * 4;
		
		assertEquals(expected, rect.calculAire());
	}

}
