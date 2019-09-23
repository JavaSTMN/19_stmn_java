package tp.Multiply;
public class tp {
	
	public static float mean(int[] tab) throws Exception {
		float result = 0;
		try {
			for(int t : tab) {
				result+= (float) t;
			}
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return result/tab.length;
	}
	
	public  static int[][] multiply(int[][] tab1, int[][] tab2) {
		int[][] result = new int[tab1[0].length][tab2.length];
		if (tab1[0].length == tab2.length) {
			for(int i = 0; i<tab1.length;i++) {
				for(int j = 0; j<tab1[i].length;j++) {
					for(int m = 0;m<tab2.length;m++) {
						result[i][j] += tab1[i][m]*tab2[m][j];						
					}
				}
			}
		}
		return result;
	}
}
