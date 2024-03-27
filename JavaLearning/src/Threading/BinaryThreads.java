package Threading;

class Thread0 extends Thread {

    @Override
    public void run() {
        for (int i = 2;i <= 10;i++)
            System.out.println(i*i + " " + Thread.currentThread());
    }
}

class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 2;i <= 10;i++)
            System.out.println(i*i*i + " " + Thread.currentThread());
    }
}

public class BinaryThreads {

    public static void main(String[] args) throws InterruptedException {
        Thread0 t0 = new Thread0();
        Thread1 t1 = new Thread1();
        t0.start();
        t0.join();       //* Thread1 waits until Thread0 will terminate. */
        t1.start();
    }    
}
