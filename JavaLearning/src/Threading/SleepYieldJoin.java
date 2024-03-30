package Threading;

//* 1. Thread.sleep()  --> pause the running thread for give millis. */
//* 2. Thread.yield()  --> pause itself until other threads will terminate. */
//& Thread.yield() not work properly in windows systems because it depends on JVM (Thread Sheduler) to accept the thread request to pause itself.
//* 3. Thread.join()   --> waits for given thread to finish. */
//& Thread.join() method should be called after the Thread.start() methods to work properly.


class Thread00 extends Thread {

    public void run() {
        int i = 1;
        while (i<=20) {
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hi...");
            i++;
        }            
    }
}

class Thread01 extends Thread {

    public void run() {

        int i = 1;
        while (i<=20) {
            try {
                // Thread.yield();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Bye..."); 
            i++;           
        }
    }

}

public class SleepYieldJoin {

    public static void main(String[] args) throws InterruptedException {
        
        Thread00 t0 = new Thread00();
        Thread01 t1 = new Thread01();
        
        t1.start();     //~ In this case t1 starts and t0 waits for it to finish. 
        t1.join(); 
        t0.start();
    }
}