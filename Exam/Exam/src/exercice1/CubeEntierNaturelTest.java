package exercice1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CubeEntierNaturelTest {
	
	@Test
	void test() {
		assertEquals(3025, CubeEntierNaturel.SumCubFirst(10)); 
		assertEquals(166375, CubeEntierNaturel.SumCubLast(10));
	}

}
