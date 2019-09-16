public class Fifo {
	int[] storage = new int[1000];
	int size = 0;
	
	
	public static void add(Fifo fifo, int receive) throws Exception{
			if(fifo.size==fifo.storage.length) throw new Exception("Liste complète");
			fifo.storage[fifo.size++]=receive;
	}
	
	public static int pull(Fifo fifo,int[] index) throws Exception{
		
		int pushed = fifo.storage[0];
		fifo.size--;
		for(int i=1;i<fifo.storage.length;i++) {
			fifo.storage[i-1]=fifo.storage[i];
		}
		return pushed;
	}
}                                                                                                                 