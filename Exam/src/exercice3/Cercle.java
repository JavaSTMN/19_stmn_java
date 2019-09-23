package exercice3;

public class Cercle extends Forme{
	private double rayon;
	
	public double Calcaire() {
		double aireCercle = 0;
		
		aireCercle = (Math.PI*rayon*2);
		
		return aireCercle; 
	}
	
	double getRayon() {
		return rayon;
	}
}
