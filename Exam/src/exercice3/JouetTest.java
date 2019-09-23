package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class JouetTest {

	@Test
	void testAireJouet() {
		double expectedCercle = Math.PI;
		double expectedTriangle = 7.5;
		double expectedRectangle = 6;

		double expectedAire = expectedCercle + expectedTriangle + expectedRectangle;
		Jouet j;
		
		try {
			Cercle c = new Cercle(1);
			Triangle t = new Triangle(2.5, 6); // hauteur, base
			Rectangle r = new Rectangle(6, 1); // largeur, hauteur

			
			// teste l'aire de chaque forme individuellement
			assertEquals(expectedCercle, c.getAire());
			assertEquals(expectedTriangle, t.getAire());
			assertEquals(expectedRectangle, r.getAire());
			

			IFormes[] formes = { c, t, r }; 
			ArrayList<IFormes> ar = new ArrayList<IFormes>(Arrays.asList(formes));
			j = new Jouet(ar);
			
			// teste l'aire du jouet
			assertEquals(expectedAire, j.getAire());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
