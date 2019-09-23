package exercice3;

public class Triangle {
	
	public double longueur;
	
	public Triangle(int longueur) {
		this.longueur = longueur;
	}
	
	public double AreaSquare() {
		double result = (Math.sqrt(3)/4) * (longueur*longueur);
		return result;
	}

}

