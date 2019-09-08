package firstProgramExo2Package;

import java.util.Arrays;

public class SecondProgram {
	
	// Faire attention à la condition sur les matrices
	
	public static void main(String[] args) {
		
		// déclaration des matrices
		int[][] A = {{ 2, 3, 5 }, 
				     { 4, 5, 6 }, 
				     { 5, 6, 7 }}; // 3x3
		
		int[][] B = {{ 9, 1, 1 }, 
					 { 5, 5, 2 }, 
					 { 8, 4, 2 }}; // 3x3
		
		int[][] C = {{ 5, 2 }, 
					 { 4, 3 }, 
					 { 6, 8 }}; //3x2
		
		int[][] D = {{ 8, 1, 4 }, 
					 { 2, 7, 9 }}; // 2x3
		
		try {
			int[][] product = multiply(A, B);
			System.out.println(Arrays.deepToString(product));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} 
	
	/*
	 * Fonction effectuant une multiplication matricielle entre deux matrices. 
	 * Retourne la matrice produit.
	 */
	public static int[][] multiply(int[][] a, int[][] b) throws Exception {
		// Si matrices vides ou incompatibles pour multiplication, on renvoie une exception
		if (a.length == 0 || b.length == 0 || a[0].length != b.length) 
			throw new Exception("Matrices invalides");

		int[][] result = new int[a.length][b[0].length];	
		// Parcours pour créer la matrice produit terme par terme
		for (int i = 0; i < a.length; i++) { 
			for (int j = 0; j < b[i].length; j++) {
				// Calcul du terme de la matrice produit à l'indice [i][j]
				result[i][j] = a[i][0] * b[0][j];
				for (int k = 1; k < a.length; k++) {
					result[i][j] += a[i][k] * b[k][j];	
				}
			}
		}
		
		return result;
	}
	
}