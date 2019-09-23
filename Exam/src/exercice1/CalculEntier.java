package exercice1;

public class CalculEntier {

	/**
	 * Calcule la somme des carres des n premiers entiers naturels
	 * 
	 * @param n les permiers entiers
	 */
	public static int getSommeCarres(int n) throws Exception {
		if (n < 0) {
			throw new Exception("n est negatif");
		}

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += Math.pow(i, 2);
		}

		return sum;
	}

	public CalculEntier() {
		// TODO Auto-generated constructor stub
	}

}
