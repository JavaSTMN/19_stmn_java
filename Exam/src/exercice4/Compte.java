package exercice4;

import java.util.Set;

public class Compte {
	private String libelle;
	private Set<Article> articles;
	
	public Compte(String libelle, Set<Article> articles) {
		this.setLibelle(libelle);
		this.articles = articles;
	}
	
	public void addArticle(Article a) {
		this.articles.add(a);
	}
	
	public void removeArticle(String id) {
		for(Article a: this.articles) {
			if (a.id == id) {
				this.articles.remove(a);
				return;
			}
		}
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
