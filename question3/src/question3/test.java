package question3;

public class test {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		
		Thread t01 = new Thread(t1,"111");
		Thread t02 = new Thread(t1,"222");
		
		t01.start();
		t02.start();
	}
}
