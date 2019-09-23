package exercice4;

import java.util.ArrayList;
import java.util.List;

public class CompteManager {
	protected static List<Compte> listComptes = new ArrayList<Compte>();
	
	public static void AjouterCompte(Compte compte) {
		listComptes.add(compte);
	}
	
	public String BilanMensuel() {
		String display = "";
		return display;
	}
	
	public String BilanAnnuel() {
		String display = "";
		return display;
	}
}
