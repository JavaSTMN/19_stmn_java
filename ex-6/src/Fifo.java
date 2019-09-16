
public class Fifo extends Stock{

	Fifo(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(int receive) throws Exception {
		// TODO Auto-generated method stub
		if(this.size==this.capacity) throw new Exception("Liste complète");
		this.storage[this.size]=receive;
		this.size++;
	}


}
