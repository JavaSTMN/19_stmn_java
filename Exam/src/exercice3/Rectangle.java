package exercice3;

public class Rectangle implements IFormeElementaire {

	double hauteur;
	double largeur;
	
	public Rectangle (double _hauteur, double _largeur) {
		this.hauteur = _hauteur;
		this.largeur = _largeur;
	}
	
	public double calculAire() {
		return hauteur * largeur;
	}
	
	public String toString() {
		return "Un Rectangle";
	}
}
