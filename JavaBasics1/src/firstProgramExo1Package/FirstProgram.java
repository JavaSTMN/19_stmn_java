package firstProgramExo1Package;

public class FirstProgram {
	
	public static double moy(double[] values) throws Exception {
		if (values.length == 0) 
			throw new Exception("Division par 0!");
		
		double sum = 0;
		for(double value : values) {
			sum += value;
		}
		
		return sum / values.length;
	} 
	
}