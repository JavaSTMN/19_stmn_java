package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CercleTest {

	@Test
	void aireTest() {
		Cercle cercle = new Cercle(2);
		
		double expected = Math.PI * 4;
		
		assertEquals(expected, cercle.calculAire());
	}
	

}
