package matrices;

public class matrice {
	
	
	public static int[][] multiply(int[][] A, int[][] B) throws Exception {
		
		if(A[0].length == 0 || A[0].length != B.length ) {
			throw new Exception("invalid matrix");
		}
		
		int result[][] = new int[A.length][B[0].length];
		
		for(int i = 0; i<result.length; i++) {
			for(int j = 0; j<result.length; j++) {
				for(int k = 0; k<A[0].length; k++) {
					result[i][j] += A[i][k] * B[k][j];
				}
			}	
		}
		return result;
	}

}
