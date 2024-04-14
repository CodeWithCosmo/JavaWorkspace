package Concepts;

class Base {    
    
    public float calc(int a, int b){
        return a+b;
    }
}

class Derived extends Base {    
    
    @Override
    public float calc(int a, int b){
        return a*b;
    }

}

public class MethodOverriding {
    public static void main(String[] args) {
        Derived d = new Derived(); 

        /*
        MethodOverridingParent can be used in place of MethodOverridingChild 
        ---> This concepts is known as //* Dynamic Method Dispatching        
        */

        float result = d.calc(10, 5);
        System.out.println(result);
    }    
}
