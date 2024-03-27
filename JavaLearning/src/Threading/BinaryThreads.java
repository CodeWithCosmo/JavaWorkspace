package Threading;

class jobA extends Thread {

    @Override
    public void run() {
        for (int i = 2;i <= 10;i++)
            System.out.println("Thread 1: "+ i*i);
    }
}

class jobB extends Thread {

    @Override
    public void run() {
        for (int i = 2;i <= 10;i++)
            System.out.println("Thread 2: "+ i*i*i);
    }
}

public class BinaryThreads {

    public static void main(String[] args) throws InterruptedException {
        jobA a = new jobA();
        jobB b = new jobB();
        a.start();
        a.join();       //* jobB waits untill jobA will terminate. */
        b.start();
    }    
}
