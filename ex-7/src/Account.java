
public class Account {
	private final String id;
	private float solde;
	
	public Account(String id) {
		this.id = id;
	}
	public float getSolde() {
		return this.solde;
	}
	
	public void deposit(float montant) {
		this.solde+= montant;
	}
	
	public void draw(float montant) throws Exception{
		if(this.solde >= montant) {
			this.solde-= montant;
		} else {
			throw new Exception("Solde trop faible");
		}
	}
	
	public void transferer(float montant, Account accountReceiver) {
		this.solde+= montant;
	}
}
