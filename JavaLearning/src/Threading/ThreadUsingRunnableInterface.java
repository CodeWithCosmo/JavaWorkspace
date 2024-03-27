package Threading;

public class ThreadUsingRunnableInterface implements Runnable{

    @Override
    public void run() {
        for (int i = 2;i < 10;i++)
            System.out.println(i*i*i);
    }

    public static void main(String[] args) {
        
        ThreadUsingRunnableInterface obj = new ThreadUsingRunnableInterface();
        Thread t = new Thread(obj); 
        t.start();
    }
    
}
