package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import org.junit.jupiter.api.Test;

class TestJouet {

	
	//fabrication du jouet défini sur la figure et calcul de son aire
	@Test
	void testJouet() throws Exception
	{
		Cercle c = new Cercle(1.0d);
		Triangle t = new Triangle(6.0d, 2.5d);
		Rectangle r = new Rectangle(1.0d, 6.0d);
		
		Forme[] compJouet = {c, t, r};
		Jouet jouet = new Jouet(compJouet);
		double aire = jouet.calculateArea();
		
		System.out.println(aire);
		//aire = 16.641592653589793
		
		
		Locale currentLocale = Locale.getDefault();
		String formatString = "#.##";
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(currentLocale);
		otherSymbols.setDecimalSeparator(',');
		otherSymbols.setGroupingSeparator('.'); 
		DecimalFormat df = new DecimalFormat(formatString, otherSymbols);
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		double expected = 16.64;
		assertEquals(df.format(expected), df.format(aire));
	}

}
