public class Lifo implements IPilling {
	
	int[] elements = new int[1000];
	int size;
	
	public static void init(Fifo fifo, int size) {
		fifo.elements = new int[size];
		fifo.size = size;
	}
	
	public int pop() {
		int head = this.elements[0];
		for (int i = 0; i < this.size; i++) {
			this.elements[i+1] = this.elements[i];
		}
		this.size--;
		return head;
	}
	
	public void push(int value) {
		this.size++;
		for (int i = 0; i < this.size; i++) {
			this.elements[i+1] = this.elements[i];
		}
		this.elements[0] = value;
	}
}