package Threading;

class Thread2 extends Thread {

    @Override
    public void run() {
        for (int i = 2; i <=10; i++) {
            System.out.println(5*i + " " + Thread.currentThread());
        }
    }
}
public class MultipleThreads {

    public static void main(String[] args) {
        Thread0 t0 = new Thread0();
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t0.start();
        t1.start();
        t2.start();    
    } 
}