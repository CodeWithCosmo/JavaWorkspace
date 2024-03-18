package AdvancedConcepts;
class user1 extends Thread {
  public void run() {
    int i = 0;
    while (i < 10) {
      System.out.println("Reading...");
      i++;
    }
  }
}

class user2 extends Thread {
  public void run() {
    int i = 0;
    while (i < 10) {
      System.out.println("Cooking...");
      i++;
    }
  }
}

public class ClassThread {
  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
    user1 t1 = new user1();
    user2 t2 = new user2();
    // t1.setPriority(Thread.MIN_PRIORITY);
    // t2.setPriority(3);
    // t1.start();
    // t2.start();
    System.out.println(t1.getId());
    //compilter gives default Id 12 and so on
    System.out.println(t2.getId());    
  }
}
  