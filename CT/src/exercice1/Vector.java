package exercice1;

public class Vector {
	private double[] x;
	private double[] w;
	
	public Vector(double[] x, double[] w) {
		this.x = x;
		this.w = w;
	}
	
	public double norm(double x1, double x2) {
		double result = 0;
		result = Math.sqrt(x1*x1 + x2*x2);
		
		return result;
	}
	
	public double[] scale(double k, double[] x) {
		double[] result = {0, 0};
		
		result[0] = x[0] * k;
		result[1] = x[1] * k;
		
		return result;
	}
	
	public double[] normalize(double norm, double[] x) {
		double[] z = {0, 0};
		z[0] = x[0] / norm;
		z[1] = x[1] / norm;
		
		return z;
	}
	
	public double[] add(double [] x, double[] y) {
		double[] sum = {0, 0};
		sum[0] = x[0] + y[0];
		sum[1] = x[1] + y[1];
		
		return sum;
	}
	
	
}
