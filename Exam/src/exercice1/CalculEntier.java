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
	
	
	/**
	 * Calcule le carre de la somme des n premiers entiers naturels
	 * 
	 * @param n les permiers entiers
	 */
	public static int getCarreSomme(int n) throws Exception {
		if (n < 0) {
			throw new Exception("n est negatif");
		}

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		return (int) Math.pow(sum, 2);
	}
	
	

	public CalculEntier() {
		// TODO Auto-generated constructor stub
	}

}
