package exercice3;

public class Cercle implements IElementaryObject {
	double rayon;
	Cercle(double r){
		this.rayon = r;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		double area = Math.PI * this.rayon * this.rayon;
		return area;
	}

}
