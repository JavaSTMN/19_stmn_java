import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSyncFifo {

	@Test
	public final void test() {
		final Fifo l = new Fifo(5000);

		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println(l.pop());
			}
		};
		
		Thread t1 =new Thread(r);
		Thread t2 =new Thread(r);
		Thread t3 =new Thread(r);
		
		Thread u =new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					l.push(1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		u.start();
		
		
		try {
			t1.join(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
