package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sommeTest {

	@Test
	void testSommeCube() throws Exception {
		double expected = 3025, elts = 10;
		assertEquals(expected, exercice1.somme.SommeCubes((int) elts));
		Throwable exception = assertThrows(Exception.class, () -> {exercice1.somme.SommeCubes(0);});
	}
	
	@Test
	void testCubeSomme() {
		double expected = 166375;
		try {
			assertEquals(expected, exercice1.somme.CubesSommes(10));
		}catch(Exception e) {
			fail("Test fail");
		}
		
	}

}
