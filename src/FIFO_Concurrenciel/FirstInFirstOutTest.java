package FIFO_Concurrenciel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import matrices.matrice;

class FirstInFirstOutTest {
	static FirstInFirstOut fifo;
	static FirstInFirstOut fifoMax;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// Setup for the FIFO without using the untested functions
		fifoMax = new FirstInFirstOut();
		fifo = new FirstInFirstOut();
		fifo.storage.add(34);
		fifo.size++;	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		fifo = null;
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNominalPush() throws Exception {
		
		
		fifo.push(24);
		
		assertEquals( 24, fifo.storage.get(fifo.size - 1).intValue());
	}
	
	@Test
	void testNominalPop() throws Exception {
		
		assertEquals(34, fifo.pop());
	}
	
	@Test
	void testSizeMaxException() throws Exception {
		fifoMax.size = fifoMax.storage.size();
		
		assertThrows(Exception.class, () -> {fifoMax.push(10);;});
	}
	
	@Test
	void testThreadAccess() throws Exception {
		Thread a = new Thread() {
			public void run() {
				FirstInFirstOut fifo = new FirstInFirstOut();

				try {
					fifo.pop();
					fifo.push(134);
					fifo.push(345);
					fifo.push(222);
					fifo.push(164);
					fifo.push(23);
					fifo.pop();
					fifo.push(354);
					fifo.push(45);
					fifo.push(265);
					fifo.push(236);
					fifo.push(444);	
				} catch (Exception e) {
					
				}
			}
		};
		
				
		Thread b = new Thread() {
			public void run() {
				FirstInFirstOut fifo = new FirstInFirstOut();

				try {
					fifo.push(134);
					fifo.push(345);
					fifo.push(222);
					fifo.push(164);
					fifo.push(23);
					fifo.pop();
					fifo.push(354);
					fifo.push(45);
					fifo.push(265);
					fifo.push(236);
					fifo.push(444);	
				} catch (Exception e) {
					
				}			
			}
		};
		
		a.start();
		b.start();
		
		try {
			a.join(5000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
			
	}

}
