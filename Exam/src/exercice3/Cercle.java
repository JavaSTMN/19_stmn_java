package exercice3;

public class Cercle implements IFormeElementaire {
	
	private double rayon;
	
	public Cercle(double _rayon) {
		this.rayon = _rayon;
	}
	
	public double calculAire() {
		return Math.PI * (rayon * rayon);
	}
	
	public String toString() {
		return "Un Cercle";
	}
}
