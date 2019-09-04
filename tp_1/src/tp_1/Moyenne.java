package tp_1;

public class Moyenne {

	/**
	 * Calculate mean of a list of numbers
	 * Class Method, isn't from an object, so the method is static
	 * @param numbers the list
	 * @return the mean
	 */
	public static double mean(double[] numbers) throws Exception {
				
		if(numbers == null || numbers.length == 0) {
			
			throw new Exception("No numbers in the list");
		}
		
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		/**
		 * Utilisation du foreach
		 * for(double value:values
		 * {
		 *		sum += value;
		 * }		 */
		
		int mean = sum/numbers.length;
		
		return mean;
	}
	

	/**
	 * Main
	 * @param args entry arguments
	 
	public static void main(String[] args) {
		//double[] numbers = {1,2,3,4,5};
		
		//To test the exception
		double[] numbers = null;
		
		double m;
		try {
			m = mean(numbers);
			System.out.println("moyenne : " + m);
		} catch (Exception e) {
			System.out.println("message d'erreur : " + e.getMessage());
			
		}
	}*/

}
