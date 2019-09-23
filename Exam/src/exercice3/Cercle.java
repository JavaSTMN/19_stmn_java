package exercice3;

public class Cercle implements IJouet {
	int rayon;
	
	public Cercle(int rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public int aire() {
		int result = (int) (Math.PI * rayon * rayon);
		return result;
	}

}
