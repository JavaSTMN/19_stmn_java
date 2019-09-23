package exercice4;

public class Article {
	public final String id;
	public double prix;
	public String categorie;
	public boolean vendu;
	
	public Article(String id, double prix,String categorie) {
		this.id=id;
		this.prix=prix;
		this.categorie=categorie;
		this.vendu=false;
	}
	
	public void SetVendu(boolean vendu ) {
		this.vendu = vendu;
	}
}
