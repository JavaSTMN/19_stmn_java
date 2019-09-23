package exercice1;

public class CubeEntierNaturel {
	
	public static int SumCubFirst(int n) {
		
		int i;
		int resultcubfirst =0; 
		
		for(i=1; i <= n; i++) {
			int a = i*i*i;
			
			resultcubfirst = resultcubfirst + a;
		}
		return resultcubfirst;
	}
	
	public static int SumCubLast(int n){
		
		int i;
		int resultcublast =0;
	
		for(i=1; i<=n; i++) {
			
			int b = i;
			resultcublast = resultcublast + b;	
		}
		resultcublast = resultcublast *resultcublast *resultcublast;
		return resultcublast;
	}

}
