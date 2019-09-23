package exercice3;

public class Triangle extends Forme {
	
	public double hauteur;
	public double base;

	public Triangle(double hauteur, double base) {
		this.hauteur = hauteur;
		this.base = base;
	}
	
	@Override
	public double calculAire() throws Exception {
		if (this.base > 0 && this.hauteur > 0) {
			return (this.base * this.hauteur) / 2;
		} else {
			throw new Exception("Un des paramètres n'est pas valide");
		}
	}
}
