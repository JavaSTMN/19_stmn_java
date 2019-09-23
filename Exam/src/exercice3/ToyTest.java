package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ToyTest {

	@Test
	void test() throws Exception {
		Toy myToy = new Toy("My new toy");
		
		Circle myCircle = new Circle("My circle", 1);
		Rectangle myRec = new Rectangle("My rectangle 1", 6, 1);
		Triangle myTriangle1 = new Triangle("My triangle1", 3, 2.5);
		Triangle myTriangle2 = new Triangle("My triangle2", 3, 2.5);
		
		myToy.add(myRec);
		myToy.add(myTriangle1);
		myToy.add(myTriangle2);
		myToy.add(myCircle);
		myToy.calcArea();
		
		double expected = 17.0 ;

		assertEquals(expected,Math.round(myToy.getArea()));
		
	}

}
