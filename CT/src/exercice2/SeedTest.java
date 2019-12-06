package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SeedTest {

	@Test
	void getElementTest() throws Exception {
		Seed seed1 = new Seed("seed1");
		Seed[] elements = {seed1};
		Seed seed2 = new Seed("seed2", elements);
		
		assertEquals("seed1", seed2.getElement(0).toString());

	}
	
	@Test
	void addElementTest() throws Exception {
		Seed seed1 = new Seed("seed1");
		Seed seed2 = new Seed("seed2");
		
		seed1.addElement(seed2);
		
		assertEquals("seed2", seed1.getElement(0).toString());
	}
	
	@Test
	void addElementsTest() throws Exception {
		Seed seed1 = new Seed("seed1");
		Seed seed2 = new Seed("seed2");
		Seed seed3 = new Seed("seed3");
		Seed seed4 = new Seed("seed4");
		
		Seed[] seeds = {seed2, seed3, seed4};
		
		seed1.addElements(seeds);
		
		assertEquals("seed2", seed1.getElement(0).toString());
		assertEquals("seed3", seed1.getElement(1).toString());
		assertEquals("seed4", seed1.getElement(2).toString());
	}
	
	@Test
	void getNbElementsTest() {
		Seed seed1 = new Seed("seed1");
		Seed seed2 = new Seed("seed2");
		Seed seed3 = new Seed("seed3");
		Seed seed4 = new Seed("seed4");
		
		Seed[] seeds = {seed2, seed3, seed4};
		
		seed1.addElements(seeds);
		
		assertEquals(3, seed1.getNbElements());
	}
	
	@Test
	void getElementsExceptionTest() {
		Seed seed1 = new Seed("seed1");
		
		assertThrows(Exception.class, () -> {
			seed1.getElement(0);
		});
	}

}
