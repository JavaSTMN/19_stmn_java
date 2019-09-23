package tp.fifolifo;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class fifoTest {
	fifo maFifo;
	fifo expectedFifo;
	Thread t;
	
	@BeforeEach
	void setUp() throws Exception {
		maFifo = new fifo(6);
		expectedFifo = new fifo(6);
		for(int i = 0; i<6;i++) {
			expectedFifo.push(i);
		}
		
		for(int i = 0; i<6;i++) {
			maFifo.push(i);
		}
		
		
		t = new Thread() {
			public void run() {
				try {
					maFifo.pop();
					maFifo.pop();
					maFifo.pop();
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		};
	}

	@AfterEach
	void tearDown() throws Exception {
		maFifo = null;
		expectedFifo = null;
		t = null;
	}

	@Test
	void firstFifotest() throws InterruptedException {
		for(int i = 0; i<6;i++) {
			expectedFifo.push(i);
		}
		
		assertArrayEquals(expectedFifo.getTab(),maFifo.getTab());
	}
}
