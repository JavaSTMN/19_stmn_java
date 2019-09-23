package exercice3;

public class Square {
	private double side;
	
	public Square(double sideLenght) {
		this.side = sideLenght;
	}
	
	public double squareAir() {
		return side*side;
		
	}
	
	public double getSide() {
		return side;
	}
}
