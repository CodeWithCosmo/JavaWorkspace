package Threading;


//* There are two ways to creating a thread 
//* 1. Using Thread Class (Implemented by Runnable Interface) --> This way is suitable for Learning purpose.*/
//* 2. Using Runnable Interface --> This way is suitable for real life projects.*/

public class ThreadUsingThreadClass extends Thread {
    
    @Override
    public void run() {
        for (int i = 2;i <= 10;i++)
            System.out.println(i*i);
    }

    public static void main(String[] args) {
        
        ThreadUsingThreadClass t = new ThreadUsingThreadClass();

        t.start();
    }
}
