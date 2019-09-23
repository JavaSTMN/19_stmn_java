package exercice4;

import java.util.ArrayList;
import java.util.List;

public class Compte {
	String nomCompte;
	protected List<Article> listArticles = new ArrayList<Article>();
	protected List<Vente> listVentes = new ArrayList<Vente>();
	
	Compte (String _nomCompte) {
		this.nomCompte = _nomCompte;
	}
	
	public void addVente(Vente vente) {
		listVentes.add(vente);
	}
	
	public void addDisponibilite(Article article) {
		listArticles.add(article);
	}
}
