import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FIFOWithoutPOOTest {

	@Test
	void testPopNominal() throws Exception {
		// init
		Fifo fifo = new Fifo();
		fifo.storage[0] = 15;
		fifo.storage[1] = 86;
		fifo.size = 2;
		
		// exec
		int result = FIFOWithoutPOO.pop(fifo);
		
		// assert	
		assertEquals(86, fifo.storage[0]);
	}
	
	@Test
	void testPushNominal() throws Exception {
		// init
		Fifo fifo = new Fifo();
		
		// exec
		FIFOWithoutPOO.push(fifo, 15);
		FIFOWithoutPOO.push(fifo, 150);
		FIFOWithoutPOO.push(fifo, 1500);
		
		// assert
		assertEquals(1500, fifo.storage[2]);
	}
	
}
