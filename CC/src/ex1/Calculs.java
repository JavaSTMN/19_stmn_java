package ex1;

public class Calculs {
	public static int sumcub(int n) {
		int result = 0;
		for (int i = 1; i<=n; i++) {
			result += i*i*i;
		}
		return result;
	}
	public static int cubsum(int n) {
		int result = 0;
		for (int i = 1; i<=n; i++) {
			result += i;
		}
		result = result*result*result;
		return result;
	}
	public static int difference(int n) {
		int result;
		result = sumcub(n) - cubsum(n);
		return result;
	}
}
