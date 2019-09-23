package exercice3;

public class Triangle implements IFormes {

	private double hauteur;
	private double base;

	public Triangle(double hauteur, double base) throws Exception {
		if (hauteur < 0 || base < 0)
			throw new Exception("Une distance est negative");

		this.hauteur = hauteur;
		this.base = base;
	}

	@Override
	public double getAire() {
		return this.base * this.hauteur / 2;
	}

}
