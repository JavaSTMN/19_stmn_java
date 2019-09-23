package exercice3;

public class Carre extends ElemShapes implements IShape {
	int cote;
	
	public Carre(int cote) {
		this.cote= cote;
	}

	public float getAire() {
		return this.cote * this.cote;
	}
}
