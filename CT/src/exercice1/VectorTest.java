package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void normTest() {
		ArrayList <Double> v =  new ArrayList <Double> ();
		v.add((double) 1);
		v.add((double) 2);
		
		double res = Math.sqrt(1*1 + 2*2); 
		assertEquals(Vector.norm(v), res);
	}

	
	@Test
	void scaleTest() {
		ArrayList <Double> v =  new ArrayList <Double> ();
		v.add((double) 1);
		v.add((double) 2);
		double k = 2;
	
		ArrayList <Double> expected =	new ArrayList <Double> ();
		 expected.add((double) 2);
		 expected.add((double) 4);
		 
		assertEquals(Vector.scale(v, k), expected);

		 
	}
	
	@Test
	void normalizeTest() {

		ArrayList <Double> v =  new ArrayList <Double> ();
		v.add((double) 1);
		v.add((double) 2);
		

		ArrayList <Double> res =	new ArrayList <Double> ();
		 res.add((double) 1/Vector.norm(v));
		 res.add((double) 2/Vector.norm(v));
		 
			assertEquals(Vector.normalize(v), res);

	}
	
	
	
	@Test
	void addTest() throws Exception {
		ArrayList <Double> v =  new ArrayList <Double> ();
		v.add((double) 1);
		v.add((double) 2);
		
		ArrayList <Double> w =  new ArrayList <Double> ();
		v.add((double) 1);
		v.add((double) 2);
		

		ArrayList <Double> res =	new ArrayList <Double> ();
		 res.add((double)2);
		 res.add((double)8);
		
		assertEquals(Vector.add(v, w), res);

	}
}
