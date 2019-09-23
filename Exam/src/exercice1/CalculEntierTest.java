package exercice1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculEntierTest {

	@Test
	void testSommeCarre() {
		int expected = 385,resultat;
		resultat=CalculEntier.sommeCarre(10);
		assertEquals(expected,resultat);
		
	}

	@Test
	void testCarreSomme() {
		int expected=3025;
		int resultat;
		resultat=CalculEntier.carreSomme(10);
		assertEquals(expected,resultat);
	}
	
	@Test
	void Difference() {
		System.out.print(CalculEntier.DiffSomme(100));
	}
}
