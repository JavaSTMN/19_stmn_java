public class Reminders {

	public static void main(String[] args) {
		try {
			float[] nombres = { 1, 6, 7, 8 };
			System.out.println("Calcul de la moyenne : " + mean(nombres));
	        
	        int m = 5;
	        int n = 6;
	        int o = 7;
	        int[][] A = new int[m][n];
	        int[][] B = new int[n][o];
	        
	        A = new int[][] { { 1, 2, 3 }, { 4, 3, 5 } };
	        B = new int[][] { { 4, 6, 7, 8 }, { 5, 8, 4, 3 }, { 7, 1, 2, 0 } };
	        System.out.println("Multiplication de matrices : " + matrixMultiplication(A, B));
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}
	
	public static float mean(float[] chiffres) throws Exception {
		if (chiffres.length > 0) {
			float total = 0;
	        for (float chiffre : chiffres) {
	            total += chiffre;
	        }
	        return total / chiffres.length;
		} else {
			throw new Exception("Division par 0");
		}
	}

	public static int[][] matrixMultiplication(int[][] a, int[][] b) throws Exception {
		if (a == null || b == null) {
			throw new Exception("Au moins une des 2 matrices est vide");
		}
		if (a[0].length != b.length) {
			throw new Exception("Multiplication impossible");
		}
		int[][] c = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) { /// Ligne de MA
			for (int j = 0; j < b[0].length; j++) { /// colonne de  MB
				for (int m = 0; m < b.length; m++) {  /// colone de MA et ligne de MB
					c[i][j] += a[i][m] * b[m][j];
				}
				System.out.println(c[i][j]);
			}
		}
		return c;
	}
}