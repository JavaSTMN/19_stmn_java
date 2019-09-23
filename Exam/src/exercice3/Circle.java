package exercice3;
import java.lang.Math.*;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public double circleAir() {
		return Math.PI*(radius*radius);
		
	}
}
