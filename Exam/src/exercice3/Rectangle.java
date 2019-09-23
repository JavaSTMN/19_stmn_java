package exercice3;

public class Rectangle implements IShape {
	float width;
	float heigth;
	
	public Rectangle(float width, float height) {
		this.width = width;
		this.heigth = height;
	}
	
	@Override
	public float area() {
		return width*heigth;
	}
}
