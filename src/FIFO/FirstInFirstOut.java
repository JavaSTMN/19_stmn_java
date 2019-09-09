package FIFO;


public class FirstInFirstOut {
	
	int[] storage = new int[10000];
	int size = 0;

	
	public static int pop(FirstInFirstOut fifo){
		int head = fifo.storage[0];
		for(int i=0; i<=fifo.size; i++) {
			
			fifo.storage[i] = fifo.storage[i+1];
		}
		fifo.size--;
		return head;
	}
	
	public static void push(FirstInFirstOut fifo, int element) throws Exception {
		if(fifo.size == fifo.storage.length)
			throw new Exception("size max");
		
		fifo.storage[fifo.size] = element;
		fifo.size++;

	}

}


