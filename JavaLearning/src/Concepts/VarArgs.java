package Concepts;

public class VarArgs {
    
    double sum(double... nos) {
        double sum = 0;
        for(double d: nos)
            sum +=d;
        
        return sum;
    }

    public static void main(String[] args) {
        VarArgs obj = new VarArgs();

        double result = obj.sum(1,2,3,4,4.5,7.3);   //* Here we pass any number of arguments that's why it is known as variable arguments */

        System.out.println("Summation of numbers: "+result);
    }
}