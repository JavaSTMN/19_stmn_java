package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAreaSum {

	@Test
	void testArea() {
		Carre carre = new Carre(4);
		Circle circle = new Circle(2);
		Triangle triangle = new Triangle(4,2.5f);
		float expected = (float) (26 + (Math.PI * 4));
		assertEquals(expected, carre.area() + circle.area() + triangle.area());
	}

}
