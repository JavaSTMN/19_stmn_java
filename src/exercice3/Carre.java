package exercice3;

public class Carre implements IForme {

	float cote;
	public  Carre(float cote_) {
		this.cote = cote_;
	}
	
	public float area() {
		System.out.println("Le jouet est composé d'un carré");
		return this.cote * this.cote;
	}
}
