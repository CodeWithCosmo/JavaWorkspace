package Assignments;

public class Constructors {
    public Constructors(){  
        this(1,2,3);      
        System.out.println("This is a default constructor.");   
    }
    
    public Constructors(int a){
        System.out.println("This is one parameterized constructor.");
    }

    public Constructors(int a,int b){
        this(1);
        System.out.println("This is two parameterized constructor.");
    }

    public Constructors(int a,int b,int c){
        System.out.println("This is three parameterized constructor.");
    }

    public Constructors(int a,int b,int c,int d){
        
        System.out.println("This is four parameterized constructor.");
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Constructors a = new Constructors();
        Constructors a2 = new Constructors(1,2);
        Constructors a4 = new Constructors(1,2,3,4);
    }
}
