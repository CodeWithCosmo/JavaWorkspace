package Assignments;

import java.util.Scanner;

public class Factorial {	
	
	public int fact(int n) {
		
		if (n == 0 || n == 1) {
			return 1;
		}
		else {
			return n * fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no = s.nextInt();
		
		if (no < 0) {
			System.out.println("Factorial of negative integers does not exist.");
			
			System.exit(0);	
		}
		
		
		System.out.println("Factorial of "+no+" is "+f.fact(no));
		
		s.close();
		
	}

}
