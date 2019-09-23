package exercice1;

public class Operations {
	
	/**
	 * Sum of cubes of n int
	 * @param n the number
	 * @return the sum
	 * @throws Exception
	 */
	public static int sumOfCube(int n) throws Exception {
		if(n == 0 || n < 0) {
			throw new Exception("Doit etre positif et non null");
		}
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i*i*i;
		}
		return sum;
	}

	/**
	 * Cube of sum of n int
	 * @param n the number
	 * @return the cube
	 * @throws Exception
	 */
	public static int cubeOfSum(int n) throws Exception {
		if(n == 0 || n < 0) {
			throw new Exception("Doit etre positif et non null");
		}
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		sum = sum*sum*sum;
		return sum;
	}

}
