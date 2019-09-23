package exercice4;

import java.util.Date;

public class ArticleVente {
	private float price;
	private String type;
	private int nb;
	private Date date;
	ArticleVente(int quantity, String t, float p){
		this.date = new Date();
		this.nb = quantity;
		this.type = t;
		this.price = p;
	}
	public String getType() {
		return this.type;
	}
	public Date getDate() {
		return this.date;
	}
	public float getTotalPrice() {
		return this.price * this.nb;
	}
}
