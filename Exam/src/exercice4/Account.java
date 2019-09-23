package exercice4;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String categorie;
	private List<Sale> sales;
	
	public Account(String categorie) {
		sales = new ArrayList<Sale>();
	}
	
	public void addSale(Sale sale) {
		sales.add(sale);
	}
	
	
	public String printBilan(String periode) {
		// TODO
		
		return null;
	}
}
