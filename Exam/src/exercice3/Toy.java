package exercice3;

public class Toy {

	private IShape[] shapes;
	
	public Toy(IShape[] shapes) {
		this.shapes = shapes;
	}
	
	public double getAire() {
		double aire = 0;
		for (IShape s : shapes) {
			aire += s.getAire();
		}
		return aire;
	}
}
