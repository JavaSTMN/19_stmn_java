package exercice4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CaisseTest {

	@Test
	void Mensualtest() {
		List<String> t = new ArrayList<String>();
		t.add("fleurs cultivées");
		t.add("accessoire");
		t.add("autre");
		AllVente ventes = new AllVente(t);
		
		ArticleVente v = new ArticleVente(2,"accessoire",20);
	}

}
