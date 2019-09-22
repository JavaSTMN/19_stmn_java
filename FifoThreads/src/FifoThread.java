
public class FifoThread extends Thread {
	
	public void run() {
		Fifo fifo = new Fifo();
		try {
			fifo.push(15);
			fifo.push(150);
			fifo.push(14);
			fifo.pop();
			fifo.pop();
			fifo.push(1);
			fifo.push(555);
			fifo.pop();
			fifo.pop();
			fifo.pop();
			fifo.push(156);
			fifo.push(15);
			fifo.push(1511);
			fifo.push(144);
			fifo.push(-9);
			fifo.push(13);
			fifo.push(19);
			fifo.push(1999);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
