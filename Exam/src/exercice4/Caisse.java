package exercice4;

import java.util.HashMap;
import java.util.Map;

public class Caisse {
	Map<String, Account> accounts;
	
	public Caisse() {
		accounts = new HashMap<String, Account>();
	}
	
	public void registerSale(String categorie, Sale sale) {
		if(!accounts.containsKey(categorie)) return;
		
		Account account = accounts.get(categorie);
		account.addSale(sale);	
	}
	
	public void printBilan(String periode, String categorie) {
		if(!accounts.containsKey(categorie)) return;
		
		Account account = accounts.get(categorie);
		// TODO
	}
	
	public void createAccount(String name) {
		Account account = new Account(name);
		
		accounts.put(name, account);
	}
	
}
