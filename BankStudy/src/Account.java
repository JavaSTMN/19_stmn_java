
public class Account {
	
	private final String id;
	
	private double solde;
	
	public Account(String id) {
		this.id = id;
		this.solde = solde;
	}
	
	public double getSolde() {
		return this.solde;
	}
	
	public void deposit(double amount) {
		this.solde += amount;
	}
	
	public void withdraw(float amount) throws Exception {
		if (this.solde - amount >= 0) {
			this.solde -= amount;
		} else {
			throw new Exception("Cannot withdraw more money than owned.");
		}
	}
	
	public void transfer(int id, float amount) {
		// trouver le client à l'id donné 
		// lui faire un deposit de amount
	}
	
}
