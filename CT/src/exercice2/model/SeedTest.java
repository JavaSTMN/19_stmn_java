package exercice2.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SeedTest {

	@Test
	void AddElementTest() {
		Seed s = new Seed("First");
		Seed y = new Seed("Yeah");
		s.addElement(y);
		String expected = "Yeah";
		try {
			assertEquals(expected, s.getElement(0).toString());
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}
	

	@Test
	void AddElementsTest() {
		Seed s = new Seed("First");
		Seed y = new Seed("Yeah");
		Seed w = new Seed("Wooh");
		Seed[] arraySeed = {y,w};
		s.addElements(arraySeed);
		String actual =  s.getElement(0).toString();
		String expected = "Yeah";
		String actual2 =  s.getElement(1).toString();
		String expected2 = "Wooh";
		try {
			assertEquals(expected, actual);
			assertEquals(expected2, actual2);
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}
	
	@Test
	void GetNbElementTest() {
		Seed s = new Seed("First");
		Seed y = new Seed("Yeah");
		Seed w = new Seed("Wooh");
		Seed[] arraySeed = {y,w};
		s.addElements(arraySeed);
		int expected = 2;
		try {
			assertEquals(expected, s.getNbElements());
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}
}
