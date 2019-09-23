
public class MyThread {
	public static void main() {
		Fifo fifo = new Fifo(1000);
		for(int i=0; i<15;i++) {
			Thread thread = new Thread(new Thread1(fifo,i));
			Thread thread2 = new Thread(new Thread2(fifo,i));
			thread.start();
			thread2.start();
		}
	}
}
