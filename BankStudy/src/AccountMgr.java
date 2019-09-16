import java.util.*;

public class AccountMgr {
	
	private Hashtable<String, Account> customerIdMap = new Hashtable<>();
	
	public Account getAccount(String nomClient) { 
		return customerIdMap.get(nomClient);
	}
	
	public void createAccount(String accountId) throws Exception {
		Account acc = getAccount(accountId);
		if (acc != null) throw new Exception("An account for id " + accountId);
		acc = new Account(accountId);
		//... récupérer la correction
	}
	
}
