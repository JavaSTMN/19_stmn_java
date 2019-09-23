package exercice3;

public class Triangle implements IForme{

	float base,hauteur;
	
	public  Triangle(float base_,float hauteur_) {
		this.base = base_;
		this.hauteur = hauteur_;
	}
	
	public float area() {
		System.out.println("Le jouet est composé d'un triangle");
		return this.base * this.hauteur;
	}
}
