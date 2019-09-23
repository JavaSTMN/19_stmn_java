package exercice4;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

class CompteTest {

	@Test
	void test() throws Exception{
		//Je n'ai pas réussi à envoyer une date directement du coup j'ai opté pour une solution temporaire par manque de temps.
		
		Compte compte = new Compte();
		Article article = new Article("Coquelicot", "Fleur", 150);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		/*compte.add(new Vente("111", formatter.parse("24/09/2018"), article));
		compte.add(new Vente("123", formatter.parse("24/09/2018"), article));
		compte.add(new Vente("454", formatter.parse("24/05/2019"), article));*/
		compte.add(new Vente("111", "Juin", 1998, article));
		compte.add(new Vente("123", "Juin", 1998, article));
		compte.add(new Vente("454", "Mai", 2005, article));
		
		assertEquals("sommeTTC:240.0sommeHT:300.0",compte.editMonth("Juin"));
		assertEquals("sommeTTC:120.0sommeHT:150.0",compte.editMonth("Mai"));
	}
	
	//add more test

}
