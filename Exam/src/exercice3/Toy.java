package exercice3;

public class Toy implements IShape {
	IShape[] shapes;
	
	public Toy(IShape[] shapes) {
		this.shapes = shapes;
	}

	@Override
	public float area() {
		float sum = 0;
		
		for (IShape shape : shapes) 
			sum += shape.area();
		
		return sum;
	}
	
}
