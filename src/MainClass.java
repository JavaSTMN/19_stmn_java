public class MainClass {
	
	public static void main(String[] args) {
		try {
			System.out.println("Moyenne : " + moy(new double[] { 1.0, 12.0, 85.0, 56.0, 140.0}));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static double moy(double[] values) throws Exception{
		if(values.length > 0) {
			double sum = 0;
			for(double value:values) {
				sum += value;
			}
			return sum/values.length;
		} else {
			throw new Exception("Aucune valeur");
		}
	}
	
}
