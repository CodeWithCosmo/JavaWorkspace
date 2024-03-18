package Assignments;

public class SuperThisMethodDerived extends SuperThisMethodBase {
    public void childmeth(){
    	this.childmeth(1);
        System.out.println("Child default method.");
    }

    public void childmeth(int a){
    	this.childmeth(1, 2);
        System.out.println("Child one parameterized method.");
    }

    public void childmeth(int a,int b){
    	super.parentmeth(1);
    	System.out.println("Child two parameterized method.");
    }

    public void childmeth(int a,int b,int c){
    	this.childmeth();
        System.out.println("Child three parameterized method.");
    }

    public static void main(String[] args) {

        SuperThisMethodDerived a3 = new SuperThisMethodDerived();
        a3.childmeth(1,2,3);
    }
}