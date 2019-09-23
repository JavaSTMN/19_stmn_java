package exercice3;

public class Triangle extends Forme{
	private double base;
	private double hauteur;
	
	public double calcAire() {
		double aireTriangle = 0;
		
		aireTriangle = ((base*hauteur)/2);
		
		return aireTriangle;
	}
	
	double getHauteur() {
		return hauteur;
	}
	
	double getBase() {
		return base;
	}
	
}
