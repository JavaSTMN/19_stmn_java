class Fifo {
	int[] storage = new int[10000];
	int size = 0;
}

public class FIFOWithoutPOO {
	
	public static int pop(Fifo fifo) {
		int head = fifo.storage[0];
		for (int i=0; i<fifo.size; i++) {
			fifo.storage[i] = fifo.storage[i+1];
		}
		fifo.size--;
		
		return head;
	}
	
	public static void push(Fifo fifo, int value) throws Exception {
		fifo.storage[fifo.size++] = value;
		
		if (fifo.size == fifo.storage.length) {
			throw new Exception("Fifo is full");
		}
	}

}
