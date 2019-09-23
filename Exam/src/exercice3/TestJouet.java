package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJouet {

	@Test
	void testJouet() {
		Rectangle rectangle = new Rectangle(4, 4);
		Cercle cercle = new Cercle(2);
		Triangle triangle = new Triangle(4, 2.5);
		IJouet[] iJouet = {rectangle, cercle, triangle};
		Jouet jouet = new Jouet(iJouet);
				
		double expected = 33;
		double actual = jouet.aire();
		
		assertEquals(expected, actual);
	}

}
