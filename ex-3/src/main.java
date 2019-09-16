public class main {
	
	public static int [][] mult(int[][] a, int [][] b)throws Exception {
		if(a.length < 1 || a[0].length != b.length) throw new Exception("Array error!");
		int [][] c =new int[a.length][b[0].length];
		
		for(int i=0;i<c.length;i++) {
				for(int j=0;j<b[0].length;j++) {
					for(int k=0;k<b.length;k++) {		
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
		}
		return c; 
	}
}                                                                                                                 