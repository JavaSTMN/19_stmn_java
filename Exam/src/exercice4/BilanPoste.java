package exercice4;

import java.util.ArrayList;
import java.util.List;

public class BilanPoste {
	private String type;
	private List<ArticleVente> ventes;
	private float priceHTTotal;
	private float priceTTCTotal;
		
	BilanPoste(String t){
		this.ventes = new ArrayList<ArticleVente>();
		this.type = t;
		this.priceHTTotal =0;
		this.priceTTCTotal =0;
	}
	public void addVente(ArticleVente v) {
		this.ventes.add(v);
	}
	public void addValueHT(float p) {
		this.priceHTTotal += p;
		this.priceTTCTotal += 1.20 * p;
	}
}
