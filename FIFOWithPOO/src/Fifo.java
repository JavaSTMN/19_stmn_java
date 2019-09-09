
public class Fifo {

	public int[] storage = new int[10000];
	public int size = 0;
	
	public int pop() {
		int head = storage[0];
		for (int i=0; i<size; i++) {
			storage[i] = storage[i+1];
		}
		size--;
		
		return head;
	}
	
	public void push(int value) throws Exception {
		storage[size++] = value;
		
		if (size == storage.length) {
			throw new Exception("Fifo is full");
		}
	}
	
}
