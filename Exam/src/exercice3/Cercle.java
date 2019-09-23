package exercice3;

public class Cercle extends Forme {
	
	public double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public double calculAire() throws Exception {
		if (this.rayon > 0) {
			return Math.PI * this.rayon * this.rayon;
		} else {
			throw new Exception("Le paramètre n'est pas valide");
		}
	}
}
