package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObjectComposedTest {

	@Test
	void ObjectExempleTest() {
		Toy toy1 = new Toy();
		toy1.addObject(new Triangle(2.5,4));
		toy1.addObject(new Cercle(2));
		toy1.addObject(new Rectangle(4,4));
		
		double total_area = toy1.getAreaOfToy();
		
		assertEquals(33.56637061435917,total_area);
		
	}

}
