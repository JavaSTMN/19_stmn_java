package exercice3;

public class Triangle {
	private double width;
	private double height;
	
	public Triangle(double toyWidth, double toyHeight) {
		this.height = toyHeight;
		this.width = toyWidth;
	}
	
	public double TriangleAir() {
		return (width*height)/2;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
}
