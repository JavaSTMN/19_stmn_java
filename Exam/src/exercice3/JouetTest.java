package exercice3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class JouetTest {

	@Test
	void testCercle() {
		double expected = Math.PI;
		Jouet jouet = new Jouet(1,0,0);
		double air=jouet.AirCercle(1);
		assertEquals(expected,air);
	}
	
	@Test
	void testRectangle() {
		double expected = 1;
		Jouet jouet = new Jouet(0,1,0);
		double air=jouet.AirRectangle(1,1);
		assertEquals(expected,air);
	}
	
	@Test
	void testTriangle() {
		double expected = 1;
		Jouet jouet = new Jouet(0,0,1);
		double air=jouet.AirTriangle(2,1);
		assertEquals(expected,air);
	}
	
	@Test
	void testComplet() {
		double expected = Math.PI+1+1;
		Jouet jouet = new Jouet(1,1,1);
		double air=jouet.AirCercle(1)+jouet.AirRectangle(1,1)+jouet.AirTriangle(2,1);
		assertEquals(expected,air);
	}

}
