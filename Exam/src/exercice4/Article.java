package exercice4;

public class Article {

	private String libelle; 
	
	private String categorie; 
	
	private double prixHT;
	
	private final double TVA = 0.20;
	
	public Article (String libelle, String categorie, double prixHT) {
		this.libelle = libelle;
		this.categorie = categorie;
		this.prixHT = prixHT;
	}
	
	public String getLibelle() {
		return this.libelle;
	}
	
	public String getCategorie() {
		return this.categorie;
	}
	
	public double getPrixHT() {
		return this.prixHT;
	}
	
	public double getPrixTTC() {
		return this.prixHT * (1 - TVA);
	}
	
}
