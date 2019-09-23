package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculEntierTest {

	@Test
	void testSommeCarresNormal() {
		int expected1 = 0;		
		int expected2 = 1;
		int expected3 = 385;
		
		try {
			assertEquals(expected1, CalculEntier.getSommeCarres(0));
			assertEquals(expected2, CalculEntier.getSommeCarres(1));
			assertEquals(expected3, CalculEntier.getSommeCarres(10));
		} catch (Exception e) {
			fail("Pas d'exception prevue");
		}
	}
	
	
	@Test
	void testSommeCarresNegatif() {		
		// La methode doit envoyer une exception si n est negatif
		assertThrows(Exception.class, () -> {
			CalculEntier.getSommeCarres(-20);
		});
	}
	
	
	@Test
	void testCarreSommeNormal() {
		int expected1 = 0;		
		int expected2 = 1;
		int expected3 = 3025;
		
		try {
			assertEquals(expected1, CalculEntier.getCarreSomme(0));
			assertEquals(expected2, CalculEntier.getCarreSomme(1));
			assertEquals(expected3, CalculEntier.getCarreSomme(10));
		} catch (Exception e) {
			fail("Pas d'exception prevue");
		}
	}
	
	
	@Test
	void testCarreSommeNegatif() {		
		// La methode doit envoyer une exception si n est negatif
		assertThrows(Exception.class, () -> {
			CalculEntier.getCarreSomme(-20);
		});
	}
	
}
