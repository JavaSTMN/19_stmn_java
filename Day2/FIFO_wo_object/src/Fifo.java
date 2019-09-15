
public class Fifo {
	int[] elements;
	int capacity;
	int size;
	
	public static void init(Fifo f, int capacity) {
		f.elements = new int[capacity];
		f.capacity = capacity;
	}
	
	public static int pop(Fifo f) throws Exception {
		if (f.size == 0) {
			throw new Exception("Fifo is empty");
		}
		// Removing first element
		int head = f.elements[0];
		// Re-ordering elements
		for (int i=1;i<f.size; i++) {
			f.elements[i-1] = f.elements[i];
		}
		f.size = f.size -1;
		return head;
	}
	
	public static void push(Fifo f, int value) throws Exception {
		if (f.size>=f.capacity) {
			throw new Exception("Max size reached. Cannot add more elements");
		}
		f.elements[f.size] = value;
		f.size = f.size + 1;
	}
}