package exercice4;

import java.util.Date;

public class Vente {
	
	public String id;
	public String mois;
	public int annee;
	public Article article; 
	
	public Vente(String id, String mois, int annee, Article article) {
		
		this.setId(id);
		this.mois =mois;
		this.annee = annee;
		this.article = article;	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
