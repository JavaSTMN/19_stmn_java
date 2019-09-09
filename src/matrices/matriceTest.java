package matrices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class matriceTest {
	int[][] A;
	int[][] B;
	int[][] C;
	int[][] empty;
	int[][] expected;
	
	// Fonction permettant d'initialiser nos variables de test
	@BeforeEach
	void setUp() throws Exception {
		A = new int[][] {
			{3,3,3,3},
			{3,3,3,3},
			{3,3,3,3}
		};
		
		B = new int[][] {
			{3,3,3},
			{3,3,3},
			{3,3,3},
			{3,3,3}
		};
		
		
		empty = new int[][] {};
		
		expected = new int[][] {
			{36, 36, 36},
			{36, 36, 36},
			{36, 36, 36}
		};
	}
	
	// Fonction permettant de libérer nos variables
	@AfterEach
	void tearDown() throws Exception {
		A = null;
		B = null;
		expected = null;
	}
	
	// Test principal de la fonction multiply
	@Test
	void testNominal() throws Exception {
		
		assertArrayEquals(expected, matrice.multiply(A,B));	
	}
	
	// Test en cas de matrice vide
	@Test
	void testArrayEmpty() throws Exception {
		Throwable exception = assertThrows(Exception.class, () -> {matrice.multiply(empty, empty);});
	}
	
	// Test en cas de nombres de lignes/colonnes incompatibles
	@Test
	void testMatrixInvalid() throws Exception {
		Throwable exception = assertThrows(Exception.class, () -> {matrice.multiply(A,A);});
	}


}
