
public class Matrix {

	public static int[][] multiply(int[][] a, int[][] b) throws Exception {
		if (a.length==0 || a[0].length != b.length) throw new Exception("Invalid array sizes");
		int[][] c = new int[a.length][b[0].length];
		
		for (int i=0; i<c.length; i++) {
			for (int j=0; j<c[0].length; j++) {
				for (int k=0; k<b.length; ++k) {
					c[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		
		return c;
	}
	
}
