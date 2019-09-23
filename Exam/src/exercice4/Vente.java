package exercice4;

import java.util.Date;

public class Vente {
	Article article;
	Date date;
	
	Vente(Article _article) {
		this.article = _article;
		this.date = new Date();
	}
}
