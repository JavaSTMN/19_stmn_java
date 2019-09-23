package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

class ToyTest {

	@Test
	void toyTest() throws Exception {
		// init
		Rectangle rect = new Rectangle(4, 4);
		Cercle cerc = new Cercle(2);
		Triangle tri = new Triangle(4, 2.5);
		Toy toy = new Toy(new IShape[] { rect, cerc, tri } );
		
		// exec
		DecimalFormat df = new DecimalFormat("##.##");
		String testValue = df.format(toy.getAire());
		
		// assert
		assertEquals("38,57", testValue);
	}

}
