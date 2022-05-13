package question3;

public class thread1 extends Thread {
	public thread1() {
		
	}
	
	public thread1(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("this is thread1");
	}

}
