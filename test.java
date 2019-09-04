
public class test {
	
	public static void main(String[] args) {
		System.out.print(moy(args));
	}
	
	private static float moy(String[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += Integer.parseInt(values[i]);
		}
		return sum / values.length;
	}
	
}