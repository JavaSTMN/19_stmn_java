import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FifoTest {

	@Test
	void Working() {
		Fifo fifo1 = new Fifo();
		
		assertDoesNotThrow(() -> {Fifo.add(fifo1, 1);});
	}

	@Test
	void NotWorking() {
		Fifo fifo1 = new Fifo();
		assertThrows(Exception.class,() -> {for(int i =0;i<1010;i++) Fifo.add(fifo1, 1);});
	}
}
