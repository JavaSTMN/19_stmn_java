
public class Function {
	public static double mean(double[] items) throws Exception {
		if (items.length==0) {
			throw new Exception("Cannot compute mean of empty list");
		}
		
		double sum = 0;
		for (double item:items) {
			sum += item;
		}
		return sum/items.length;
	}
}
