public class Fifo {
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
	public void add(int receive) throws Exception{
			if(this.size==this.capacity) throw new Exception("Liste complète");
			this.storage[this.size++]=receive;
	}
	
	public int pull() throws Exception{
		
		int pulled = this.storage[0];
		this.size--;
		for(int i=1;i<this.storage.length;i++) {
			this.storage[i-1]=this.storage[i];
		}
		return pulled;
	}
}                                                                                                                 