package Assignments;

class SuperThisParent {
    
    SuperThisParent(){
    	this(1,2,3);
        System.out.println("Parent class default constructor.");
    }
    
    SuperThisParent(int a){
    	this();
        System.out.println("Parent class one parameterized constructor.");
    }
    
    SuperThisParent(int a,int b){
        this(1);
        System.out.println("Parent class two parameterized constructor.");
    }
    
    SuperThisParent(int a,int b,int c){
        System.out.println("Parent class three parameterized constructor.");
    }
    
}
class SuperThisChild extends SuperThisParent {
    
    SuperThisChild(){
        super(1,2);
        System.out.println("Child class default constructor.");        
    }

    SuperThisChild(int a){
    	this(1,2,3);
        System.out.println("Child class one parameterized constructor.");
    }

    SuperThisChild(int a,int b){
    	this();
        System.out.println("Child class two parameterized constructor.");
    }

    SuperThisChild(int a,int b,int c){
    	this(1,2);
    	System.out.println("Child class three parameterized constructor.");
    }      
}

public class SuperThisConstructor {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        SuperThisChild a1 = new SuperThisChild(1);
    }
}