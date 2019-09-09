package FIFO_Object;


public class FirstInFirstOut {
	int[] storage = new int[10000];
	int size = 0;

	public int pop(){
		int head = storage[0];
		for(int i=1; i<size; i++) {
			
			storage[i] = storage[i + 1];
		}
		size = size - 1;
		return head;
	}
	
	public void push(int element) throws Exception {
		if(size == storage.length)
			throw new Exception("size max");
		
		storage[size] = element;
		size++;
	}
}
