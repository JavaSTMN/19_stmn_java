package exercice3;

public class Circle implements Form{
	
	private double rayon;

	public Circle(double r) {
		this.rayon = r;
	}
	
	@Override
	public double calcArea() {
		return 2 * Math.PI * rayon;
	}
	
	

}
