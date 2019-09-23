package exercice1;

public class Computer {

	public static int sumSqrt(int n) throws Exception{
		int res = 0;
		if(n == 0 ) {
			throw new Exception("Cannot calculte square of 0");
		} else {
			for(int i = 1; i <= n; i++) {
				res += i*i;
			}
			return res;
		}
	}
	
	public static int sqrtSum(int n) throws Exception {
		int res = 0;
		if(n <= 0 ) {
			throw new Exception("Parameters n should be different of 0 and positif");
		} else {
			for(int i = 1; i <= n; i++) {
				res += i;
			}
			res = res * res;
			
			return res;
		}
	}
	
	public static int diffSqrtSum(int n) throws Exception {
		int diff, sqrt, sum;
		sqrt = sqrtSum(n);
		sum = sumSqrt(n);
		diff = sqrt - sum;
		return diff;
		
	}
	
}
