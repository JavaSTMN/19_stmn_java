package exercice1;

public class Vector {
	
	public static double norm(double[] v) throws Exception {
		
		if(v.length == 0) {
			throw new Exception("Vecteur vide");
		}
		
		double result = 0;
		
		for(int i = 0; i< v.length; i++) {
			result += v[i] * v[i];
		}
		
		return Math.sqrt(result);
	}
	
	public static double[] scale(double[] v, double k) throws Exception {
		if(v.length == 0) {
			throw new Exception("Vecteur vide");
		}
		
		double[] result = new double[v.length];
		
		for(int i = 0; i< v.length; i++) {
			result[i] = k * v[i];
		}
		
		return result;	
	}
	
	public static double[] normalize(double[] v) throws Exception {
		if(v.length == 0) {
			throw new Exception("Vecteur vide");
		}
		
		double[] result = new double[v.length];
		
		for(int i = 0; i < v.length; i++) {
			result[i] = v[i] / norm(v);
		}
		
		return result;
	}
	
	public static double[] add(double[] v1, double[] v2) throws Exception {
		if( v1.length != v2.length) {
			throw new Exception("Les vecteurs sonts de taille différente");
		}
		
		double[] result = new double[v1.length];
		
		for( int i = 0; i<v1.length; i++) {
			result[i] = v1[i] + v2[i];
		}
		
		return result;
	}
}
