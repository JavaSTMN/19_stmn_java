package exercice3;

public class Circle implements IShape {
	float rayon;
	
	public Circle(float rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public float area() {
		return (float) (Math.PI*rayon*rayon);
	}
	
}
