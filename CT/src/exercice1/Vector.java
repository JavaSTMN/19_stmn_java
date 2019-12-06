package exercice1;

public class Vector {
	
	public static double norm(double[][] v){
		double n = Math.abs(Math.sqrt(Math.pow(v[0][0], 2) + Math.pow(v[1][0], 2)));
		return n;
	}
	
	public static double[][] scale(double k, double[][]v) {
		double[][] w = {{k * v[0][0]}, {k * v[1][0]}};	
		return w;
	}
	
	public static double[][] normalize(double[][]v){
		double[][] w = {{(v[0][0]/Vector.norm(v))},{(v[1][0]/Vector.norm(v))}};
		return w;
	}
	
	public static double[][] add(double[][] v, double[][] w) {
		double[][] x = {{v[0][0] + w[0][0]}, {v[1][0] + w[1][0]}};
		return x;
	}

}
