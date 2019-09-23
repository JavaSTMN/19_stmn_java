package exercice3;

public class Triangle implements IShape {

	private double base; 
	
	private double hauteur;
	
	public Triangle(double b, double h) {
		this.base = b;
		this.hauteur = h;
	}
	
	public double getAire() {
		return base * hauteur;
	}
}
