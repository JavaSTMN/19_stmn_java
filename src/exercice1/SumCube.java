package exercice1;

public class SumCube {
	
	public static double Sum(double n) {
		double sum = Math.pow(n*(n+1)/2,2);
		return sum;
	}
	
	public static double CubeOfSum(double n) {
		double sum = 0;
		
		for (int i=0; i<=n; i++) {
			sum += i;
		}
		
		sum = Math.pow(sum, 3);
		return sum;
	}
	
	public static double DiffSum(double n) {
		double sum = SumCube.CubeOfSum(n) - SumCube.Sum(n);
		System.out.println(sum);
		return sum;
	}
}
