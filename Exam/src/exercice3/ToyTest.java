package exercice3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ToyTest {

	@Test
	void testTotalAreas() throws Exception {
		
		Circle c = new Circle(2);
		Triangle t = new Triangle(4, 2.5);
		Rectangle r = new Rectangle(4,4);
		
		Toy<Form> toy = new Toy<Form>();
		toy.forms.add(c);
		toy.forms.add(t);
		toy.forms.add(r);
		
		System.out.println(toy.calcTotalAreas());
		
		//circle then triangle then rectangle
		double toTest = (2 * Math.PI * 2) + (0.5 * 4 * 2.5) + (4 * 4); 
		
		assertEquals(toy.calcTotalAreas(), toTest);
	}

}
