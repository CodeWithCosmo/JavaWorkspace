package Threading;

//* Here we are creating 2 threads using single class */
class ThreadParent extends Thread {
	
	public void run() {
		for(int i = 1; i <= 9; i++)
			System.out.println(i + " " + Thread.currentThread());
	}
}

//& Thread.currentThread() returns the following [thread_id,thread_name,thread_priority,thread_groupname] */

public class ThreadsUsingSingleClass {
	public static void main(String[] args) {
		
		ThreadParent t1 = new ThreadParent();
		ThreadParent t2 = new ThreadParent();
		t1.start();
		t2.start();
	}
}
