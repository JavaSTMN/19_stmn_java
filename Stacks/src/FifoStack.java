
public class FifoStack implements IStack {

	public int[] storage = new int[10000];
	public int size = 0;
	
	@Override
	public void push(int value) throws Exception {
		storage[size++] = value;
		
		if (size == storage.length) {
			throw new Exception("Fifo is full");
		}
	}

	@Override
	public int pop() {
		int head = storage[0];
		for (int i=0; i<size; i++) {
			storage[i] = storage[i+1];
		}
		size--;
		
		return head;
	}

}
