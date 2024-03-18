package Assignments;

public class ThisMethod {

    public void method(){
        System.out.println("Default method.");
    }
    public void method1(){
        System.out.println("One parameterized method.");
    }
    public void method2(){
        this.method3();
        this.method4();
        this.method();
        this.method1();
        System.out.println("Two parameterized method.");
    }
    public void method3(){
        System.out.println("Three parameterized method.");
    }
    public void method4(){
        System.out.println("Four parameterized method.");
    }

    public static void main(String[] args) {
    ThisMethod a2 = new ThisMethod();
    
    a2.method2();
    }
}
