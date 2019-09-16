public class main {
	public static void main(String[] args) {
		float[] collectionNumbers = { 10,10,20,20};
		float moyenne =0;
		try {
			moyenne = moy(collectionNumbers);
			System.out.println(moyenne);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static float moy(float[]numbers)throws Exception {
		float sum=0;
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