package Concepts;

public class MethodOverloading {
    
    public void add(int a, int b){
        System.out.println("Sum is " + (a+b));
    }

    public void add(int a, double b){
        System.out.println("Sum is " + (a+b));
    }

    public void add(int a, int b, int c){
        System.out.println("Sum is " + (a+b+c));
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.add(10,20);           //^ Implicit casting when add(int,int) is absent
        m.add(10,20.4);         //^ Explicit casting when add(int,double) is absent --> m.add(10,(int) 20.4);
        m.add(10,20,30);
    }
}
