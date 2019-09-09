import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LifoStackTest {

	@Test
	void lifoTestPopNominal() throws Exception {
		// init
		LifoStack fifo = new LifoStack();
		fifo.storage[0] = 15;
		fifo.storage[1] = 86;
		fifo.storage[2] = 11;
		fifo.size = 3;
		
		// exec
		int result = fifo.pop();
		
		// assert	
		assertEquals(86, fifo.storage[1]);
	}
	
	@Test
	void lifoTestPushNominal() throws Exception {
		// init
		LifoStack fifo = new LifoStack();
		
		// exec
		fifo.push(15);
		fifo.push(150);
		fifo.push(1500);
		
		// assert
		assertEquals(1500, fifo.storage[2]);
	}

}
