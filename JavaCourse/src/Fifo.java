public class Fifo implements IPilling {

	int[] elements = new int[1000];
	int size;
	
	public static void init(Fifo fifo, int size) {
		fifo.elements = new int[size];
		fifo.size = size;
	}
	
	/*public static int pop(Fifo fifo) {
		int head = fifo.elements[0];
		for (int i = 0; i < fifo.size; i++) {
			fifo.elements[i-1] = fifo.elements[i];
		}
		fifo.size = fifo.size - 1;
		return head;
	}

	public static void push(Fifo fifo, int value) throws Exception {
		fifo.elements[fifo.size] = value;
		fifo.size++;
		if (fifo.size == fifo.elements.length) {
			throw new Exception("Une exception");
		}
	}*/
	
	public int pop() {
		int head = this.elements[0];
		for (int i = 0; i < this.size; i++) {
			this.elements[i-1] = this.elements[i];
		}
		this.size = this.size - 1;
		return head;
	}
	
	public void push(int value) {
		this.elements[this.size] = value;
		this.size++;
	}
}