package exercice4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AllVente {
	private List<ArticleVente> ventes;
	private List<String> type;
	AllVente(List<String> t){
		this.ventes = new ArrayList<ArticleVente>();
		this.type = t;
		
	}
	public void add(ArticleVente v) {
		this.ventes.add(v);
	}
	public ArrayList<BilanPoste> editBilan(boolean a){
		ArrayList<BilanPoste> listedBilan = new ArrayList<BilanPoste>();
		for(int y=0;y<this.type.size();y++) {
				String T = this.type.get(y);
				listedBilan.add(bilanByType(T,a));
		}
		return listedBilan;
	}
	public BilanPoste bilanByType(String T, boolean a) {

		BilanPoste b = new BilanPoste(T);
		Date actualDate = new Date();
		int yeara = actualDate.getYear();
		
		for(int i=0;i<this.ventes.size();i++) {
			ArticleVente v = this.ventes.get(i);
			int yearv = v.getDate().getYear();
			if(v.getType() == T) {
				if(a == true) {
					if(yeara == yearv) {
						b.addVente(v);
						b.addValueHT(v.getTotalPrice());
					}
				
				} else {
					int montha = actualDate.getMonth();
					int monthv = v.getDate().getMonth();
					if(yeara == yearv && montha == monthv ) {
						b.addVente(v);
						b.addValueHT(v.getTotalPrice());
					}
				}
			}
		}
		return b;
	}
}
