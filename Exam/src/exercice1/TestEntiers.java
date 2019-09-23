package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import javax.sql.rowset.serial.SerialArray;

import org.junit.jupiter.api.Test;

class TestEntiers {

	@Test
	void testSomCUb() {

		double expected = 3025;
		try {
			assertEquals(expected, Entiers.somCub(10));
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}

	@Test
	void testCubSom() {

		double expected = 166375;
		try {
			assertEquals(expected, Entiers.cubSom(10));
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}

	@Test
	void testDiff() {

		try {

			Double diff = Entiers.cubSom(100) - Entiers.somCub(100);

		} catch (Exception e) {
			fail("Test should not throw");
		}
	}

}
