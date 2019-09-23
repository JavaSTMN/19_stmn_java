package exercice3;

public class Rectangle implements IFormes {
	private double largeur;
	private double hauteur;
	
	public Rectangle(double largeur, double hauteur) throws Exception {
		if (largeur < 0 || hauteur < 0)
			throw new Exception("Une distance est negative");
		
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	@Override
	public double getAire() {
		return largeur * hauteur;
	}

}
