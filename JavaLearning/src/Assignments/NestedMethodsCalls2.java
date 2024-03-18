package Assignments;

public class NestedMethodsCalls2 {
    
    public float sum(float a,float b){
        return a+b;
    }
    public float pro(float c,float d){
        return c*d;
    }

    public static void main(String[] args) {
        NestedMethodsCalls2 a2 = new NestedMethodsCalls2();
        float output = a2.pro(a2.sum(a2.sum(a2.sum(a2.pro(10,1/2f),-2),2),-2),1/2f);
        System.out.println("The output is " + output);
    }
}