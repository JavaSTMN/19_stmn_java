package exercice3;

public class Triangle implements IFormeElementaire {
	double hauteur;
	double base;
	
	public Triangle(double _hauteur, double _base) {
		this.hauteur = _hauteur;
		this.base = _base;
	}
	
	public double calculAire() {
		return (base * hauteur) / 2;
	}
	
	public String toString() {
		return "Un Triangle";
	}
	
	
}
