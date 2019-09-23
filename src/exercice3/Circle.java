package exercice3;

public class Circle implements IForme {
	
	float r;
	public  Circle(float r_) {
		this.r = r_;
	}
	
	public float area() {
		System.out.println("Le jouet est composé d'un cercle");
		return (float) (Math.PI * Math.pow(this.r,2));
	}

	
}
