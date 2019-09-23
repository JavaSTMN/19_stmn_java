package exercice3;

public class Triangle extends AreteObject{

	Triangle(double h, double b) {
		super(h, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		double area = (this.base*this.hauteur) /2;
		return area;
	}
}
