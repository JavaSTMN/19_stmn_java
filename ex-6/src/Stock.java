
abstract class Stock implements Stockage{
	protected int[] storage;
	protected int capacity;
	protected int size;
	Stock(int capacity){
		this.setStorage(new int[capacity]);
		this.setCapacity(capacity);
		this.setSize(0);
	}
	public int[] getStorage() {
		return storage;
	}
	public void setStorage(int[] storage) {
		this.storage = storage;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public int pull() {
		// TODO Auto-generated method stub
		int pulled = this.storage[0];
		this.size--;
		for(int i=1;i<this.storage.length;i++) {
			this.storage[i-1]=this.storage[i];
		}
		return pulled;
	}
	
	@Override
	public int getElement(int i) {
		// TODO Auto-generated method stub
		return this.storage[i];
	}
}
