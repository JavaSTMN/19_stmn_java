package exercice1;

public class Calculator {

	public static int sumOfCubes(int n) throws Exception {
		if (n < 0) {
			throw new Exception("Invalid input, please give a value >= 0.");
		}
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i*i*i;
		}
		
		return sum;
	}
	
	public static int cubeOfSum(int n) throws Exception {
		if (n < 0) {
			throw new Exception("Invalid input, please give a value >= 0.");
		}
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum*sum*sum;
	}
	
}
