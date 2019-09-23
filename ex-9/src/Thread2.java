
public class Thread2 implements Runnable {
	private Fifo fifo;
	private int vthread;
	public Thread2(Fifo fifo,int vthread) {
		this.fifo = fifo;
		this.vthread = vthread;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			int pulled = this.fifo.pull();
			this.fifo.add(2);
			pulled = this.fifo.pull();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
