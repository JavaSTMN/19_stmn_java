
public class Function {
	public static void main(String[] argv) {
		double[] items = new double[] {1, 2};
		try {
			System.out.println(mean(items));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
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
