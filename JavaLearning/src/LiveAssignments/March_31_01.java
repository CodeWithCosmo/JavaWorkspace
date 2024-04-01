package LiveAssignments;

public class March_31_01 {
    public int sum(int a,int b){
        return a+b;
    }
    public float pro(float c,float d){
        return c*d;
    }
    public static void main(String[] args) {
        March_31_01 a1 = new March_31_01();
        float output = a1.pro(a1.pro(a1.sum(a1.sum(a1.sum(10,2),2),-2),2),1/2f);
        System.out.println("The output is " + output);
    }
}