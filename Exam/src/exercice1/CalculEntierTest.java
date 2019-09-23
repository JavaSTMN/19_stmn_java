package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculEntierTest {

	@Test
	void testSommeCarresNormal() {
		int expected1 = 0;		
		int expected2 = 1;
		int expected3 = 14;
		
		try {
			assertEquals(expected1, CalculEntier.getSommeCarres(0));
			assertEquals(expected2, CalculEntier.getSommeCarres(1));
			assertEquals(expected3, CalculEntier.getSommeCarres(3));
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
	
	
}
