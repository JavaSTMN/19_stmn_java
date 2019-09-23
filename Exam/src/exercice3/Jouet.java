package exercice3;


public class Jouet {
	private int nbCercle;
	private int nbRectangle;
	private int nbTriangle;
	
	public Jouet(int nbCercle, int nbRectangle, int nbTriangle) {
		this.nbCercle=nbCercle;
		this.nbRectangle=nbRectangle;
		this.nbTriangle=nbTriangle;
	}
	
	public double AirCercle(int Rayon) {
		double res=Math.PI*Rayon*Rayon;
		return res;
	}
	
	public double AirRectangle(double Longueur, double Largeur) {
		double res = Longueur*Largeur;
		return res;
	}
	
	public double AirTriangle(double Base,double Hauteur) {
		double res = (Base*Hauteur)/(double)2;
		return res;
	}
}
