package Concepts;

//* Sum of n numbers using command line arguments */

public class CommandLineArguments {
	
	public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++)         
            sum += Integer.parseInt(args[i]);
        System.out.println("Sum of " + args.length + " numbers = " + sum);		
	}

}
