package exercice1;

public class Somme {
	public static int sommeDesCubes(int[] tab) {
		int somme = 0;
		
		for(int i = 0; i < tab.length; i++) {
			somme += Math.pow(tab[i], 3);
		}
		return somme;
	}
	
	public static int cubesSomme(int[] tab) {
		int result = 0;
		
		for(int i = 0; i < tab.length; i++) {
			result += tab[i];
		}
		result = (int) Math.pow(result, 3);
		
		return result;
	}
	
	public static int difference(int result1, int result2) {
		int result = 0;
		
		result = result2 - result1;
		
		return result;
	}
}
