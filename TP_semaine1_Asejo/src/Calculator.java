
public class Calculator {

	public static void main(String[] args) {
		double[] myNumList = {15 , 5};

		double result = mean(myNumList);
		
		System.out.println("Result moyenne : " + result);
		
	}
	
	
	//methode de classe donc preciser STATIC
	public static double mean(double[]numList) {
		double m = 0;
		int n = numList.length;
		
		for(int i = 0; i < n ; i++)
			m += numList[i]; 
		
		m = m / n ;
		return m;
	}

	public static double meanException(double[]numList) throws Exception{
		double m = 0;
		int n = numList.length;
		
		if(n != 0) {
			for(int i = 0; i < n ; i++)
				m += numList[i]; 
			
			m = m / n ;
			return m;
		} else throw new Exception ("divided by 0");
	}
	
	public static int[][] matrixMultiplication(int[][]a, int[][]b) {
		//int[][] c = null;
		
		// condition n colonne de A = n ligne de B
		
		
		
		//for(in)
		
		return c;
	}
}
