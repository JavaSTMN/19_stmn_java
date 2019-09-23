package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JouetTest {

	@Test
	void aireTotaleTest() {
		Cercle cercle = new Cercle(1);
		Triangle triangle = new Triangle(2.5, 6);
		Rectangle rectangle = new Rectangle(1, 6);
		
		IFormeElementaire[] formes = {cercle,triangle,rectangle};
		
		Jouet jouet = new Jouet(formes);
		
		double expected;
		expected = 1 * Math.PI;
		expected += (6 * 2.5) / 2;
		expected += 6 * 1;
		
		assertEquals(expected, jouet.calculAire());	
	}
	
	@Test
	void descriptionTest() {
		Cercle cercle = new Cercle(1);
		Triangle triangle = new Triangle(2.5, 6);
		Rectangle rectangle = new Rectangle(1, 6);
		
		IFormeElementaire[] formes = {cercle,triangle,rectangle};
		
		Jouet jouet = new Jouet(formes);
		
		String expected = "Un Cercle Un Triangle Un Rectangle ";
		
		assertEquals(expected, jouet.description());
	}

}
