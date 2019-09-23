package exercice4;

public class Caisse {
	public String nomArticle;
	public float prixHT;
	public int stockArticle;
	
	public Caisse(String nomArticle, float prixHT, int stockArticle) {
		this.nomArticle = nomArticle;
		this.prixHT = prixHT;
		this.stockArticle = stockArticle;
	}
	
	public int gestionStock(Caisse caisse) throws Exception {
		if(caisse.stockArticle == 0) {
			throw new Exception("Le stock de cet article est égal à 0!!!");
		}
		else {
			return caisse.stockArticle--;
		}
	}
}
