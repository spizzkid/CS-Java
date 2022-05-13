package question3;

public class test {
    public static void main(String[] args) {

        myThread ms = new myThread();

        Thread t1 = new Thread(ms, "number 1");
        Thread t2 = new Thread(ms, "number 2");


        t1.start();
        t2.start();



    }
}
