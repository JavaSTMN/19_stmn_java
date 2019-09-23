public class Fifo{
	private int[] storage;
	private int capacity;
	private int size;
	Fifo(int capacity){
		this.storage = new int[capacity];
		this.capacity = capacity;
		this.size = 0;
	}
	public int[] getStorage() {
		return this.storage;
	}
	public int getSize() {
		return this.size;
	}
	public synchronized void add(int receive) throws Exception{
		System.out.println("push");
			if(this.size==this.capacity) throw new Exception("Liste complète");
			this.storage[this.size++]=receive;
			notifyAll();
	}
	
	public synchronized int pull() throws Exception{
		while(this.size ==0) {
			try{
				wait();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("pull");
		int pulled = this.storage[0];
		this.size--;
		for(int i=1;i<this.storage.length;i++) {
			this.storage[i-1]=this.storage[i];
		}
		return pulled;
	}
}                                                                                                                 