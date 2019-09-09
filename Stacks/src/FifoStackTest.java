import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FifoStackTest {

	@Test
	void fifoTestPopNominal() throws Exception {
		// init
		FifoStack fifo = new FifoStack();
		fifo.storage[0] = 15;
		fifo.storage[1] = 86;
		fifo.size = 2;
		
		// exec
		int result = fifo.pop();
		
		// assert	
		assertEquals(86, fifo.storage[0]);
	}
	
	@Test
	void fifoTestPushNominal() throws Exception {
		// init
		FifoStack fifo = new FifoStack();
		
		// exec
		fifo.push(15);
		fifo.push(150);
		fifo.push(1500);
		
		// assert
		assertEquals(1500, fifo.storage[2]);
	}

}
