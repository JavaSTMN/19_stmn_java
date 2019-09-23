package exercice1;

public class SumInt {
	
	public static int sumSquare(int limit) {
		int result = 0;
		for (int i = 1; i <= limit; i++) {
			result += i*i;
		}
		return result;
	}
	
	public static int squareSum(int limit) {
		int result = 0;
		for (int i = 1; i <= limit; i++) {
			result += i;
		}
		return result * result;
	}
	
	public static int difference() {
		int limit = 100;
		int sumSquare = sumSquare(limit);
		int squareSum = squareSum(limit);
		System.out.println(sumSquare);
		System.out.println(squareSum);
		return squareSum - sumSquare;
	}
}
