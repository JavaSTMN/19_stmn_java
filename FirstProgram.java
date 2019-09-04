public class FirstProgram {
	
	public static void main(String[] args) {
		System.out.print(moy(new double[] {1, 2}));
	}
	
	private static double moy(double[] values) {
		double sum = 0;
		
		for(double value : values) {
			sum += value;
		}
		
		return sum / values.length;
	}
	
}