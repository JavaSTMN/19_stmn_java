import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FifoTest {

	@Test
	void testThreads() throws Exception {
		// init
		FifoThread ft1 = new FifoThread();
		FifoThread ft2 = new FifoThread();
		
		// exec
		ft1.start();
		ft2.start();
		
		
	}
	
	@Test
	void testPushNominal() throws Exception {
		// init
		Fifo fifo = new Fifo();
		
		// exec
		fifo.push(15);
		fifo.push(150);
		fifo.push(1500);
		
		// assert
		assertEquals(1500, fifo.getValueAt(2));
	}
	
	@Test
	void testPopNominal() throws Exception {
		// init
		Fifo fifo = new Fifo();
		fifo.push(15);
		fifo.push(86);
		
		// exec
		int result = fifo.pop();
		
		// assert	
		assertEquals(result, 15);
	}
}
