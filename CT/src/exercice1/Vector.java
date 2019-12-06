package exercice1;

public class Vector {
	
	public static double norm(double[] vector) {
		return Math.sqrt(Math.pow(vector[0], 2) + Math.pow(vector[1], 2));
	}
	
	public static double[] scale(double[] vector, double k) {
		return new double[] { vector[0] * k, vector[1] * k };
	}
	
	public static double[] normalize(double[] vector) {
		double n = norm(vector);
		return new double[] { vector[0] / n, vector[1] / n};
	}
	
	public static double[] add(double[] v1, double[] v2) {
		return new double[] { v1[0] + v2[0], v1[1] + v2[1] };
	}
}
