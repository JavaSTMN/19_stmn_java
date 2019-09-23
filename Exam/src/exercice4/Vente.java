package exercice4;

import java.util.Date;
import java.util.HashMap;

public class Vente {
	private Date dateEnreg;
	private HashMap<String, Integer> lignes;
	
	public Vente(Date dateEnreg, HashMap<String, Integer> lignes) {
		this.dateEnreg = dateEnreg;
		this.lignes = lignes;
	}
	
	
	
	public void ajouterLigne(String idArticle, int quantite) {
		this.lignes.put(idArticle, quantite);
	}
	
	public double getTotalTTC( ) {
		for (Entry<String, Integer> ligne : lignes.entrySet()) {
			
		}
		return 1;
	}
	public double getTotalHT() {
		return 1;
	}

}
