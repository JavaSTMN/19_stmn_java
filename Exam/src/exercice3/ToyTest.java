package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ToyTest {

	@Test
	void TestToyArea() {
		IShape[] shapes = {new Circle(1f), new Triangle(2.5f, 6f), new Rectangle(6f,1f)};
		Toy toy = new Toy(shapes);
		
		// sum of circle area, triangle area and rectangle area
		float expected =  (float) (Math.PI + 7.5f + 6f);
		
		float actual = toy.area();
		
		// use of roundAvoid to keep 4 decimals of results
		assertEquals(roundAvoid(expected, 4), roundAvoid(actual, 4));
	}
	
	double roundAvoid(double value, int places) {

		 double scale = Math.pow(10, places);

		 return Math.round(value * scale) / scale;
	}

}
