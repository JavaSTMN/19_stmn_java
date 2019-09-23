package tp.AccountEx;

public class Account {
	public String id;
	private float solde;
	
	Account(String id){
		this.id = id;
		this.solde = 0;
	}
	
	public float getSolde() {
		return this.solde;
	}
	
	public synchronized void deposit(float BalanceToAdd) {
		this.solde += BalanceToAdd;
	}
	
	public synchronized void withdraw(float money) throws Exception{
		if(money<solde) throw new Exception("Cannot withdraw more than current");
		this.solde -= money;
	}
	
	public void transfer(Account idAccount, float money) throws Exception {
		idAccount.deposit(money);
		this.withdraw(money);
	}
}
