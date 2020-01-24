package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FonctionTest {

	@Test
	void test() {
		/*double a = 2;
		double b = -6;
		Fonction F = new Fonction(a, b);
		
		assertEquals(2, F.result());   // Renvoie a
		*/
		
		/*double a = 9;
		double b = -9;
		Fonction F = new Fonction(a, b);
		
		assertEquals(9, F.result());   // Renvoie max des deux donc 9
		*/
		
		double a = -13;
		double b = -2;
		Fonction F = new Fonction(a, b);
		
		assertEquals(-2, F.result());   // Renvoie b
	}

}
