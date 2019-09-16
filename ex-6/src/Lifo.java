
public class Lifo extends Stock{
	Lifo(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void add(int receive) throws Exception{
		// TODO Auto-generated method stub
		if(this.size==this.capacity) throw new Exception("Liste complète");
		
		for(int i=this.storage.length;i>0;i--) {
			this.storage[i]=this.storage[i-1];
		}
		this.storage[0]= receive;
		this.size++;
	}



}
