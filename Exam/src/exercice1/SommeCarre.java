package exercice1;

public class SommeCarre {
	
	public static int calculSommeCarre(int nbInt) {
		
		int sqrtSum = 0;
		
		for(int i=1; i<=nbInt; i++) {
			sqrtSum += (i * i);
		}
		
		return sqrtSum;
	}
	
	public static int calculCarreSomme(int nbInt ) {
		
		int sumSqrt = 0;
		
		for(int i = 1; i<= nbInt; i++) {
			sumSqrt += i;
		}
		
		
		return sumSqrt * sumSqrt;
	}
	
}
