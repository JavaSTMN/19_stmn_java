import java.util.HashMap;
import java.util.Map;

public class AccountManager {
	private final Map<String,Account> links;

	AccountManager(){
		links = new HashMap<>();
	}
	public Account getAccount(String accountId) {
		return links.get(accountId);
	}
	public Account createAccount(String accountId) {
		Account nouveau_compte = new Account(accountId);
		links.put(accountId,nouveau_compte);
		return nouveau_compte;
	}
	public void deleteAccount(String accountId) {
		Account account_to_delete = links.get(accountId);
		account_to_delete = null;
		links.remove(accountId);
	}

}                                                                                                                 