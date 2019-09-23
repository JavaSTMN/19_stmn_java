package exercice1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class SommeTest {

	@Test
	public void testSommeDesCarres() throws Exception{
		int expected = 385;
		int actual = Somme.SommeDesCarres(10);
		assertEquals(expected, actual);
	}

	public void testCarreDeLaSomme() throws Exception{
		int expected = 3025;
		int actual = Somme.CarreDeLaSomme(10);
		assertEquals(expected, actual);
	}
	
	public void testDifference() throws Exception{
		int expected = 2640;
		int actual = Somme.Difference(10);
		assertEquals(expected, actual);
	}
}
