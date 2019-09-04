package FirstProgramPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstProgramTest {

	@Test
	void moyTestNominal() throws Exception {
		assertEquals(1.5f, FirstProgram.moy(new double[] { 1, 2 }));
	}
	
	@Test
	void moyTestThrow() throws Exception {
		assertThrows(Exception.class, () -> { FirstProgram.moy(new double[] {});});
	}

}
