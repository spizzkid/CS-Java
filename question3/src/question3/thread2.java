package question3;

public class thread2 extends Thread {
	public thread2() {
		
	}
	
	public thread2(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("this is thread2");
	}
}
