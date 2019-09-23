package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestFormes {

	@Test
	void testDescription() {
		Triangle triangle = new Triangle(2.5, 6);
		Rectangle rectangle = new Rectangle(6, 1);
		Cercle cercle = new Cercle(1);
		ArrayList<Forme> formes = new ArrayList<Forme>();
		formes.add(triangle);
		formes.add(rectangle);
		formes.add(cercle);
		Production production = new Production(formes);
		String result = production.decrireJouet();
		String expected = "Cercles : 1 - Rectangles : 1 - Triangles : 1";
		assertEquals(expected, result);
	}
	
	@Test
	void testCalculAire() throws Exception {
		Triangle triangle = new Triangle(2.5, 6);
		Rectangle rectangle = new Rectangle(6, 1);
		Cercle cercle = new Cercle(1);
		ArrayList<Forme> formes = new ArrayList<Forme>();
		formes.add(triangle);
		formes.add(rectangle);
		formes.add(cercle);
		Production production = new Production(formes);
		double result = production.calculAireJouet();
		double expected = (6 * 2.5) / 2 + 6 + Math.PI;
		assertEquals(expected, result);
	}
	
	@Test
	void testDescriptionNotWorks() {
		Triangle triangle = new Triangle(2.5, 6);
		Rectangle rectangle = new Rectangle(6, 1);
		Cercle cercle = new Cercle(1);
		ArrayList<Forme> formes = new ArrayList<Forme>();
		formes.add(triangle);
		formes.add(rectangle);
		formes.add(cercle);
		Production production = new Production(formes);
		String result = production.decrireJouet();
		assertNotEquals("Cercles : 2 - Rectangles : 3 - Triangles : 1", result);
	}
	
	@Test
	void testCalculAireNotWorks() throws Exception {
		Triangle triangle = new Triangle(2.5, 6);
		Rectangle rectangle = new Rectangle(6, 1);
		Cercle cercle = new Cercle(1);
		ArrayList<Forme> formes = new ArrayList<Forme>();
		formes.add(triangle);
		formes.add(rectangle);
		formes.add(cercle);
		Production production = new Production(formes);
		double result = production.calculAireJouet();
		assertNotEquals(2, result);
	}
}
