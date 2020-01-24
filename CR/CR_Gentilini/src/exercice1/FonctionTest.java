package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FonctionTest {

	@Test
	void testReduction() {
		Fonction a = new Fonction(-5, 4);
		Fonction b = new Fonction(4, -4);
		double expected = 4;
		double expected2 = 4;
		assertEquals(expected, a.reduction());
		assertEquals(expected2, b.reduction());
	}
	

}
