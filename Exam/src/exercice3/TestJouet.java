package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercice1.Entiers;

class TestJouet {

	@Test
	void testCarre() {

		float expected = 16;
		try {

			ElemShapes carre1 = new Carre(4);

			assertEquals(expected, carre1.getAire());
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}

	@Test
	void testTriangle() {

		float expected = 5;
		try {

			ElemShapes tri1 = new Triangle(5, 2);
			assertEquals(expected, tri1.getAire());
		} catch (Exception e) {
			fail("Test should not throw");
		}

	}

	@Test
	void testCercle() {
		float expected = 2 * (float) Math.PI;
		try {

			ElemShapes cer1 = new Cercle(1);
			assertEquals(expected, cer1.getAire());
		} catch (Exception e) {
			fail("Test should not throw");
		}

	}
	
	@Test
	void testaddList() {
		try {
			Jouet jouet = new Jouet();
			ElemShapes cer1 = new Cercle(1);
			ElemShapes tri1 = new Triangle(5, 2);
			ElemShapes carre1 = new Carre(4);
			
			jouet.formes.add(carre1);
			jouet.formes.add(cer1);
			jouet.formes.add(tri1);
		} catch (Exception e) {
			fail("Test should not throw");
		}

	}

}
