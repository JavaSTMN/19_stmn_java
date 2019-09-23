package exercice3;

public class Circle extends Form {
	
	private double ray;
	
	public Circle(String description, double diameter) throws Exception {
		super(description);
		this.setDiameter(diameter);
		this.calcArea();
	}

	@Override
	public void calcArea() {
		this.setArea(Math.PI * Math.sqrt(this.ray));
	}

	public double getDiameter() {
		return ray;
	}

	public void setDiameter(double diameter) {
		this.ray = diameter;
	}

}
