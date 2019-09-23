package exercice4;

import java.util.Date;

public class Sale {
	private String articleName;
	private float priceHT;
	private Date timestamp;
	
	public Sale(String name, float priceHT) {
		timestamp = new Date();
	}
	
	public String getName() {
		return articleName;
	}
	
	public float getPriceHT() {
		return priceHT;
	}
	
	@SuppressWarnings("deprecation")
	public int getSellingYear() {
		return timestamp.getYear() + 1900;
	}
	
	@SuppressWarnings("deprecation")
	public int getSellingMonth() {
		return timestamp.getMonth();
	}
}
