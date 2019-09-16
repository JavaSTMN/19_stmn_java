
public class Fifo extends AXiXo {

	public Fifo(int capacity) {
		super(capacity);
	}
	
	Fifo(int capacity, int[] elements) {
		super(capacity, elements);
	}

	public int pop() throws Exception {
		if (size == 0) {
			throw new Exception("Fifo is empty");
		}
		// Removing first element
		int head = elements[0];
		// Re-ordering elements
		for (int i=1;i<size; i++) {
			elements[i-1] = elements[i];
		}
		size = size -1;
		return head;
	}
	
}