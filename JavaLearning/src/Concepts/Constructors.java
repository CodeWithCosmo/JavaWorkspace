package Concepts;

public class Constructors {
    
    public Constructors(){

        this(10);
        System.out.println("This is a default constructor.");   
    }
    
    public Constructors(int a){
        System.out.println("This is a parameterized constructor.");
    }

   

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Constructors a1 = new Constructors();
        @SuppressWarnings("unused")
        Constructors a2 = new Constructors(10);

    }
}
