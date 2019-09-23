package exercice3;

public class Triangle implements Form{
	
	private double base;
	private double hauteur;
	
	public Triangle(double b, double h) {
		this.base = b;
		this.hauteur = h;
	}

	@Override
	public double calcArea() {
		return 0.5 * base * hauteur;
	}

}
