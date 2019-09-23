
public class Thread1 implements Runnable {
	private Fifo fifo;
	private int vthread;
	public Thread1(Fifo fifo,int vthread) {
		this.fifo = fifo;
		this.vthread = vthread;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.fifo.add(2);
			int pulled = this.fifo.pull();
			this.fifo.add(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
