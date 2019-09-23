package exercice3;

public class Triangle implements IShape {
	private float height;
	private float base;
	
	public Triangle(float height, float base) {
		this.height = height;
		this.base = base;
	}
	
	@Override
	public float area() {
		return (base * height) / 2;
	}
}
