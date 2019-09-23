package exercice3;

import java.util.ArrayList;
import java.util.List;

public class BabyToy {
	private List<Circle> listOfCircle;
	private List<Triangle> listOfTriangle;
	private List<Square> listOfSquare;
	
	public BabyToy() {
		listOfCircle = new ArrayList<Circle>();
		listOfTriangle = new ArrayList<Triangle>();
		listOfSquare = new ArrayList<Square>();
	}
	
	public void addACircle(Circle theCircle) {
		listOfCircle.add(theCircle);
	}
	
	public void addATriangle(Triangle theTriangle) {
		listOfTriangle.add(theTriangle);
	}
	
	public void addASquare(Square theSquare) {
		listOfSquare.add(theSquare);
	}
	
	public double getAreaOfTheToy() {
		double circleArea = 0;
		double triangleArea = 0;
		double squareArea = 0;
		for (Circle circle : listOfCircle) {
			circleArea += circle.circleAir();
		}
		for (Square square : listOfSquare) {
			squareArea += square.squareAir();
		}
		for (Triangle triangle : listOfTriangle) {
			triangleArea += triangle.TriangleAir();
		}
		return circleArea + squareArea + triangleArea;
	}
}
