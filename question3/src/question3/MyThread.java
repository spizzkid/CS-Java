package question3;

public class MyThread implements Runnable {

	@Override
	public void run() {
		try {
			synchronized(this) {
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
