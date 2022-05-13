package question3;

public class myThread implements Runnable{
    private int n = 20;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (n >= 0) {
                    System.out.println("µ¹Êý:" + n);
                    n--;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }

        }
    }
}
