package exercice3;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class JouetTest {

	@Test
	void testDescription() throws Exception {
		Forme cercle = new Forme("cercle", 1);
		Forme triangle = new Forme("triangle", 2.5f, 6);
		Forme rectangle = new Forme("rectangle", 1, 6);
		Jouet jouet = new Jouet();
		
		jouet.add(cercle);
		jouet.add(triangle);
		jouet.add(rectangle);
		
		String actual = jouet.Description();
		String expected = "cercle;triangle;rectangle;";
		assertEquals(expected, actual);
	}
	
	void testCalcul() throws Exception {
		Forme cercle = new Forme("cercle", 1);
		Forme triangle = new Forme("triangle", 2.5f, 6);
		Forme rectangle = new Forme("rectangle", 1, 6);
		Jouet jouet = new Jouet();
		
		jouet.add(cercle);
		jouet.add(triangle);
		jouet.add(rectangle);
		
		float actual = jouet.CalculAire();
		float expected = (float) (13.5 + Math.PI);
		assertEquals(expected, actual);
	}

}
