import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LifoTest {

	@Test
	void Working() {
		Fifo fifo1 = new Fifo(1000);
		assertDoesNotThrow(() -> {fifo1.add(1);});
		System.out.println(fifo1.getSize());
	}
	
	@Test
	void isFull() {
		Fifo fifo1 = new Fifo(1000);
		assertThrows(Exception.class,() -> {for(int i =0;i<1010;i++) fifo1.add(i);});
	}

}
