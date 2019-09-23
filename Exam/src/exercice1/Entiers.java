package exercice1;

public  class Entiers {

	public static double somCub(double nbr) {
		double res = 0;

		for (double i = 1; i <= nbr; i++) {
			res += (i * i * i);

		}

		return res;

	}

	public static double cubSom(double nbr) {
		double res = 0;

		for (double i = 1; i <= nbr; i++) {
			res += i;
		}

		res = (res * res * res);

		return res;

	}

}
