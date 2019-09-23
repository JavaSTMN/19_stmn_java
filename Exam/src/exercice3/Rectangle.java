package exercice3;

public class Rectangle extends Form{
	private double base;
	private double height;

	public Rectangle(String description, double base, double height) throws Exception {
		super(description);
		this.base = base;
		this.height = height;
		this.calcArea();
	}

	@Override
	void calcArea() {
		this.setArea(base * height);	
	}
	
}
