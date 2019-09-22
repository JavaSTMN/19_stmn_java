package bank;

import java.util.HashMap;
import java.util.Hashtable;

public class AccountManager {
	
	private Hashtable<String, Account> accounts = new HashTable<>();
	
	public Account getAccount(String accountId) {
		return accounts.get(accountId);
	}
	
    public Account createAcount(String accountId) throws Exception {
    	
    }
    
    public void deleteAccount(Account toDelete) {
    	
    }
    
    

}
