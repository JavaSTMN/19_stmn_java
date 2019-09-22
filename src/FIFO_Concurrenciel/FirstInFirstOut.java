package FIFO_Concurrenciel;

import java.util.ArrayList;

public class FirstInFirstOut {
	ArrayList<Integer> storage = new ArrayList<Integer>(); 
	int size = 0;
	boolean isUsed = false;

	public synchronized int pop(){
		
		while(size == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		while(isUsed) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int head = storage.get(0);
		for(int i=1; i<size; i++) {
			
			storage.set(i, storage.get(i + 1));
		}
		size = size - 1;
		
		isUsed = false;
		notifyAll();
		return head;
	}
	
	public synchronized void push(int element) throws Exception {
		
		if(size == storage.size())
			throw new Exception("size max");
		
		storage.set(size, element);
		size++;
		notifyAll();
	}
}
