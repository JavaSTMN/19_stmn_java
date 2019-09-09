package tp;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class fifoTest {
	fifo maFifo;
	fifo expectedFifo;

	@BeforeEach
	void setUp() throws Exception {
		maFifo = new fifo(6);
		expectedFifo = new fifo(6);
		for(int i = 0; i<6;i++) {
			expectedFifo.push(i);
		}
	}

	@AfterEach
	void tearDown() throws Exception {
		maFifo = null;
		expectedFifo = null;
	}

	@Test
	void firstFifotest() {
		for(int i = 0; i<6;i++) {
			maFifo.push(i);
		}
		assertArrayEquals(expectedFifo.getTab(),maFifo.getTab());
	}
}
