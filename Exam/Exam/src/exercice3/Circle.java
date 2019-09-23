package exercice3;

public class Circle {
	public double longueur;
	
	public Circle(int longueur) {
		this.longueur = longueur;
	}
	
	public double AreaSquare() {
		double result = Math.PI * (longueur*longueur);
		return result;
	}

}
