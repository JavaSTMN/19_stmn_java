package exercice3;

public class Rectangle implements IJouet {
	int longueur, largeur;
	
	public Rectangle(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public int aire() {
		int result = longueur * largeur;
		return result;
	}
}
