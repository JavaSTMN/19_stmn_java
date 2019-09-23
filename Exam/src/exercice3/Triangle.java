package exercice3;

public class Triangle extends ElemShapes implements IShape{
	int base;
	int hauteur;
	
	public Triangle(int base, int hauteur) {
		this.hauteur= hauteur;
		this.base = base;
	}
	
	public float getAire() {
		float aire;
		aire = (this.base*this.hauteur)/2;
		return aire;
	}
	
	
}
