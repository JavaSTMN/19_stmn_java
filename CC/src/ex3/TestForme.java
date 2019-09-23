package ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestForme {

	@Test
	void testEnsemble() {
		Rectangle testCarre = new Rectangle();
		testCarre.param1 = 4;
		Cercle testCercle = new Cercle();
		testCercle.param1 = 2;
		TriangleEq testTriangle = new TriangleEq();
		testTriangle.param1 = 4;
		testTriangle.param2 = (float) 2.5;
		
		testCarre.calcaire();
		testCercle.calcaire();
		testTriangle.calcaire();
		
		double result = testCarre.aire + testCercle.aire + testTriangle.aire;
		double expected = 33.566370614359172953850573533118;
		assertEquals (result, expected, 0.01);
	}

	@Test
	void testJouet() {
		Rectangle testCarre = new Rectangle();
		testCarre.param1 = 4;
		Cercle testCercle = new Cercle();
		testCercle.param1 = 2;
		TriangleEq testTriangle = new TriangleEq();
		testTriangle.param1 = 4;
		testTriangle.param2 = (float) 2.5;
		
		Jouet testJouet = new Jouet(new Forme[] {testCarre, testCercle, testTriangle});
		
		testJouet.calcAire();
		
		double result = testJouet.aire;
		double expected = 33.566370614359172953850573533118;
		assertEquals (result, expected, 0.01);
	}
}
