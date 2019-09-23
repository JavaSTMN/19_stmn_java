package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BabyToyTest {
	BabyToy babyToy;
	Circle aCircle;
	Triangle aTriangle;
	Square aSquare;
	double expectedArea;
	
	
	@BeforeEach
	void setUp() throws Exception {
		babyToy = new BabyToy();
		aSquare = new Square(4);
		aCircle = new Circle(2);
		aTriangle = new Triangle(4,2.5);
		babyToy.addACircle(aCircle);
		babyToy.addASquare(aSquare);
		babyToy.addATriangle(aTriangle);
		expectedArea = (Math.PI*Math.pow(aCircle.getRadius(), 2)) + Math.pow(aSquare.getSide(), 2)
			+ ((aTriangle.getHeight()*aTriangle.getWidth())/2);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		babyToy = null;
	}

	@Test
	void test() {
		assertEquals(expectedArea, babyToy.getAreaOfTheToy());
	}

}
