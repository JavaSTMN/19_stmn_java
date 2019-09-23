package exercice3;

public class Rectangle extends Forme {
	
	public double longueur;
	public double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public double calculAire() throws Exception {
		if (this.longueur > 0 && this.largeur > 0) {
			return this.longueur * this.largeur;
		} else {
			throw new Exception("Un des paramètres n'est pas valide");
		}
	}
}
