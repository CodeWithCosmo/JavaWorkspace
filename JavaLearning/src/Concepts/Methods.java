package Concepts;

public class Methods{
    
    public void msg(){
        System.out.println("Default user defined method.");
    }
    public void pro(int a, int b){
        
        System.out.println("Parameterized user defined method: axb is " + a*b);
    }
    public static void main(String[] args){
        System.out.println("Main method - Predefined Method.");

        Methods a1 = new Methods();
        Methods a2 = new Methods();
        a1.msg();
        a2.pro(2,4);
    }
   
}