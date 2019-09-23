package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void test() {
		Triangle triangle = new Triangle(3, 2);
		
		double expected = (2 * 3) / 2;
		
		assertEquals(expected, triangle.calculAire());
	}

}
