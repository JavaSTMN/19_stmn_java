package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SommeCarreTest {

	@Test
	void calculSommeCarreTest() {
		int expected = 385;
		
		assertEquals(expected, SommeCarre.calculSommeCarre(10));
	}
	
	@Test
	void calculCarreSommeTest() {
		int expected = 3025;
		
		assertEquals(expected, SommeCarre.calculCarreSomme(10));
	}
	
	@Test
	void differenceTest() {
		int sommeCarre = SommeCarre.calculSommeCarre(100);
		int carreSomme = SommeCarre.calculCarreSomme(100);
		
		System.out.println(sommeCarre);
		System.out.println(carreSomme);
		
		int expected = 25502500 - 338350;
		
		int difference = carreSomme - sommeCarre;
		
		assertEquals(expected, difference);
	}
	
	

}
