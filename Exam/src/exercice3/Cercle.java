package exercice3;

public class Cercle implements IFormes {
	private double rayon;

	public Cercle(double rayon) throws Exception {
		if (rayon < 0)
			throw new Exception("Une distance est negative");
		this.rayon = rayon;
	}

	@Override
	public double getAire() {
		return Math.PI * Math.pow(this.rayon, 2);
	}

}
