package exercice3;

public class Rectangle implements Form{

	private double longueur;
	private double largeur;
	
	public Rectangle(double lo, double la) {
		this.longueur = lo;
		this.largeur = la;
	}
	
	
	@Override
	public double calcArea() {
		return longueur * largeur;
	}
	
	
}
