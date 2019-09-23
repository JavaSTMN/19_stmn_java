package tp.AccountEx;

import java.util.Hashtable;

public class AccountManager {
	private final Hashtable<String, Account> accounts= new Hashtable<>();
	
	public Account getAccount(String str) {
		return accounts.get(str);
	}
	
	public Account createAccount (String accountId) throws Exception {
		Account account = getAccount(accountId);
		if (account != null) throw new Exception("An account for id"+accountId);
		account = new Account(accountId);
		accounts.put(account.id,account);
		return account;
	}
	
	public void closeAccount(String accountId) throws Exception {
		Account account = getAccount(accountId);
		if (account == null) throw new Exception("This account does not exist : " + accountId);
		account = null;
	}

}
