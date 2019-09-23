package exercice1;
public class CalculEntier {

	public static int sommeCarre(int n) {
		int res=0;
		for(int i=1;i<=n;i++) {
			res=res+(i*i);
		}
		return res;
	}
	
	public static int carreSomme(int n) {
		int res=0;
		for(int i=1;i<=n;i++) {
			res=res+i;
		}
		res=res*res;
		return res;
	}
	
	public static int DiffSomme(int n ) {
		int res=0;
		res=carreSomme(n)-sommeCarre(n);
		return res;
	}
}
