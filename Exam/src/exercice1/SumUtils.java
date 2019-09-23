package exercice1;

public class SumUtils {
	
	public static int sumSquare(int n) {
		int sum = 0;
		
		for(int i=1;i<=n;++i) {
			sum += i*i;
		}
		
		return sum;
	}
	
	public static int squareSum(int n) {
		int sum = 0;
		
		for(int i=1;i<=n; ++i) {
			sum += i;
		}
		
		return sum*sum;
	}
	
	public static int subtraction(int n) {
		return Math.abs(squareSum(n) - sumSquare(n));
	}
}
