package exercice3;

public class Cercle implements IShape {

	private double radius;
	
	public Cercle(double rad) {
		this.radius = rad;
	}
	
	public double getAire() {
		return Math.PI * Math.pow(radius, 2);
	}
	
}
