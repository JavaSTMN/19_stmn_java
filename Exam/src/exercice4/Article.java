package exercice4;

import java.util.Date;

public class Article
{
	String libelle;
	float prixHT;
	Compte typeCompte;
	int stock;
	
	Article(String _libelle, float _prixHT, Compte _typeCompte, int _stock)
	{
		libelle = _libelle;
		prixHT = _prixHT;
		typeCompte = _typeCompte;
		stock = _stock;
	}
	
	void AddArticle(int qtt)
	{
		stock += qtt;
	}
	
	void RemoveArticle(int qtt)
	{
		stock -= qtt;
	}
	
	void vente(Date date, int qtt)
	{
		
		RemoveArticle(qtt);
	}
}
