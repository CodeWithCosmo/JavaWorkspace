package Assignments;

public class SuperThisMethodBase {
	public void parentmeth(){
    	this.parentmeth(1, 2);
        System.out.println("Parent default method.");
    }

    public void parentmeth(int a){
    	this.parentmeth(1, 2, 3);
        System.out.println("Parent one parameterized method.");
    }

    public void parentmeth(int a,int b){
        System.out.println("Parent two parameterized method.");
    }
    
    public void parentmeth(int a,int b,int c){
    	this.parentmeth();
        System.out.println("Parent three parameterized method.");
    }

}
