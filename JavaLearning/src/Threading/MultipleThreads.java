package Threading;

class jobC extends Thread {

    @Override
    public void run() {
        for (int i = 100; i >=91; i--) {
            System.out.println("Thread 3: " + Math.sqrt(i));
        }
    }
}
public class MultipleThreads {

    public static void main(String[] args) {
        jobA a = new jobA();
        jobB b = new jobB();
        jobC c = new jobC();
        a.start();
        b.start();
        c.start();
    
    } 
}