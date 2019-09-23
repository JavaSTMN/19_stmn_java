package exercice3;

public class Carre {
	private double cote;
	
	public double calcAire() {
		double aireCarre = 0;
		
		aireCarre = cote * cote;
		
		return aireCarre;
	}
	
	double getCote() {
		return cote;
	}
}
