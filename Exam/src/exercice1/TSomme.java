package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TSomme {

	@Test
	void testSommeCubes() {
		int expected = 0;
		int[] tab = new int[100];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = i + 1;
			expected += Math.pow(tab[i], 3);
		}
		
		int actual = Somme.sommeDesCubes(tab);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCubesSomme() {
		int expected = 166375;
		int[] tab = new int[100];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = i + 1;
			expected += i + 1;
		}
		expected = (int) Math.pow(expected, 3);
		int actual = Somme.cubesSomme(tab);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDifference() {
		int[] tab = new int[100];
		int expected1 = 0, expected2 = 0;
		for(int i = 0; i < tab.length; i++) {
			tab[i] = i + 1;
			expected1 += Math.pow(tab[i], 3);
			expected2 += i + 1;
		}
		expected2 = (int) Math.pow(expected2, 3);
		
		int result1 = Somme.sommeDesCubes(tab);
		int result2 = Somme.cubesSomme(tab);
		
		int expected = expected2 - expected1;
		int actual = Somme.difference(result1, result2);
		
		assertEquals(expected, actual);
	}
}
