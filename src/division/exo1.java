package division;



public class exo1 {

//	public static void main(String[] args) {
//		float[] numbers = {1, 4, 2, 5, 8, 3};
//		
//		try {
//			System.out.println(moy(numbers));
//		}catch(Exception e) {
//			
//		}
//		
//	}
	
	public static float moy(float[] numbers) throws Exception {
		int sum = 0;
		for(float number: numbers) {
			sum += number;
		}
		
		if(numbers.length == 0) {
			throw new Exception("Division par 0");
		}else {
			return sum/numbers.length;
		}
		
		
	}
	
	

}
