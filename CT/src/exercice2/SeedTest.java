package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SeedTest {

	@Test
	void  addElementsTest() {
		Seed <ISeed>mySeed = new Seed<ISeed>("mySeed");
		

		//mySeed.addElements((ISeed) new Seed("newSeed"));
		
		int expectedNb= 1;
		
		assertEquals(expectedNb, mySeed.getNbElements());
		assertEquals("mySeed", mySeed.toString());
			
	}
	
	

}
