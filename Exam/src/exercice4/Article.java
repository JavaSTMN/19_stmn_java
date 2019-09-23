package exercice4;

import java.util.UUID;

public class Article {

	private String libelle;
	private double prixHT;
	private double prixTTC;
	private double tauxTVA;
	public String id;
	
	
	public Article(String libelle, double prixHT, double prixTTC, double tauxTVA) {
		this.libelle = libelle;
		this.prixHT = prixHT;
		this.prixTTC = prixTTC;
		this.tauxTVA = tauxTVA;
		
		this.id = UUID.randomUUID().toString();
	}


	public String getLibelle() {
		return libelle;
	}


	public double getPrixHT() {
		return prixHT;
	}


	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}


	public double getPrixTTC() {
		return prixTTC;
	}


	public void setPrixTTC(double prixTTC) {
		this.prixTTC = prixTTC;
	}


	public double getTauxTVA() {
		return tauxTVA;
	}


	public void setTauxTVA(double tauxTVA) {
		this.tauxTVA = tauxTVA;
	}
		

}
