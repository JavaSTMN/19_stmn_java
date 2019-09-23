package exercice3;

public class Triangle implements IJouet {
	int base; 
	double hauteur;
	
	public Triangle(int base, double hauteur) {
		this.base = base;
		this.hauteur = hauteur;
	}

	@Override
	public int aire() {
		int result = (int) (base * hauteur) / 2;
		return result;
	}
	
}
