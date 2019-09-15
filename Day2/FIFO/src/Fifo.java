
public class Fifo {
	private int[] elements;
	private int capacity;
	private int size;
	
	public Fifo(int capacity) {
		elements = new int[capacity];
		this.capacity = capacity;
		size = 0;
	}
	
	// Important notice: This method has default visibility for test purpose
	Fifo(int capacity, int[] elements) {
		this(capacity);
		for (int i=0; i<elements.length; ++i) {
			this.elements[i] = elements[i];
		}
		size = elements.length;
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
	
	public void push(int value) throws Exception{
		if (size>=capacity) {
			throw new Exception("Max size reached. Cannot add more elements");
		}
		elements[size] = value;
		size = size + 1;
	}
	
	// Important notice: This method has default visibility for test purpose
	int getSize() {
		return size;
	}
	
	// Important notice: This method has default visibility for test purpose
	int getElement(int i) {
		return elements[i];
	}
}