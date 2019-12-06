package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void testNorm() {
		Vector test = new Vector();
		
		test.x = 3.0;
		test.y = 4.0;
		assertEquals(5.0,test.norm(), "norm of (3,4) should be 5");
		
		test.x = -3.0;
		test.y = 4.0;
		assertEquals(5.0,test.norm(), "norm of (-3,4) should be 5");
		
		test.x = 0.0;
		test.y = 0.0;
		assertEquals(0.0,test.norm(), "norm of (0,0) should be 0");
	}

	@Test
	void testScale() {
		Vector test = new Vector();
		
		test.x = 2.0;
		test.y = 3.0;
		Vector res = test.scale(4);
		assertEquals(8.0,res.x, "2 times 4 should be 8");
		assertEquals(12.0,res.y, "3 times 4 should be 12");
	}

	@Test
	void testNormalize() {
		Vector test = new Vector();
		
		test.x = 2.0;
		test.y = -3.0;
		Vector res = test.normalize();
		assertEquals(1,res.x, "positive");
		assertEquals(-1,res.y, "negative");
		
		test.x = 0.0;
		test.y = 0.0;
		res = test.normalize();
		assertEquals(0,res.x, "zero");
		assertEquals(0,res.y, "zero");
	}

	@Test
	void testAdd() {
		Vector test = new Vector();
		Vector addition = new Vector ();
		
		test.x = 3.0;
		test.y = 4.5;
		addition.x = 2.7;
		addition.y = -0.2;
		Vector res = test.add(addition);
		assertEquals(5.7,res.x, "3 + 2.7 = 5.7");
		assertEquals(4.3,res.y, "4.5 + (-0.2) = 4.3");
	}

}
