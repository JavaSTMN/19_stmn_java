package exercice3;

public class Forme {
	String type;
	float hauteur;
	float longueur;
	float rayon;
	
	public Forme(String _type, float _rayon) {
		this.type = _type;
		this.rayon = _rayon;
	}
	
	public Forme(String _type, float _hauteur, float _longueur) {
		this.type = _type;
		this.hauteur = _hauteur;
		this.longueur = _longueur;
	}
}
