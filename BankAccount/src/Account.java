public class Account {
private float solde;
private int id;


public float Consulter() {
	return this.solde;
}

public float Créditer(float montant) {
	this.solde=this.solde+montant;
	return this.solde;
}

public float Débiter(float montant) {
	if(this.solde>montant) {
		this.solde=this.solde-montant;
		return solde;
	}
	else {
		return -1;
	}
	
}
public void transfer(float montant) {
	
}

}
