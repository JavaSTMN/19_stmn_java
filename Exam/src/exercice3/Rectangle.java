package exercice3;

public class Rectangle implements IShape {

	private double longueur;
	
	private double largeur;
	
	public Rectangle (double lng, double lrg) {
		this.longueur = lng;
		this.largeur = lrg;
	}
	
	public double getAire() {
		return longueur * largeur;
	}
	
}
