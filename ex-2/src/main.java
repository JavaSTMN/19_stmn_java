public class main {
	
	public static double moy(double[]numbers)throws Exception {
		double sum=0;
		if(numbers.length > 0) {
			for(int i=0; i<numbers.length;i++) {
				sum+=numbers[i];
			}
			return sum/numbers.length;
		} else {
			throw new Exception("division par 0");
		}
	}
}                                                                                                                 