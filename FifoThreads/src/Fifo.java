import java.util.*;

public class Fifo {

	public ArrayList<Integer> storage = new ArrayList<Integer>();

    // True if receiver should wait
    // False if sender should wait
    private boolean operating = true;
	
	public synchronized int pop() {
		
		while(!operating) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		int poppedValue = storage.get(0);
		storage.remove(0);
		
		notifyAll();
		return poppedValue;
	}
	
	public synchronized void push(int value) throws Exception {

		while(!operating) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		storage.add(value);
		
		notifyAll();
	}
	
	public int getValueAt(int index) throws Exception {
		if (index < 0 || index > storage.size()) 
			throw new Exception ("Invalid index");
		
		return storage.get(index);
	}
}
