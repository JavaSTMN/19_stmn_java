public class MainClass {
	
	public static void main(String[] args) {

	}

	public static double moy(double[] values) throws Exception {
		if(values.length == 0) {
			throw new Exception("No value.");
		}

		double sum = 0;
		for(double value:values) {
			sum += value;
		}
		return sum/values.length;
	}
	
	public static int[][] multiply(int[][] A, int[][] B) throws Exception{

		if(A == null){
			throw new Exception("Matrix A is null.");
		}

		if(B == null){
			throw new Exception("Matrix B is null.");
		}

		if(A[0].length != B.length){
			throw new Exception("Matrix's dimensions mismatch.");
		}

		int[][] C = new int[A.length][B[0].length];
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < B[0].length; j++) {
				for (int k = 0; k < B.length; k++){
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return C;
	}
	
}
