package Assignments;

import java.util.Scanner;

public class FibonacciSeries {	
	
	public int fib(int n) {
		
		if (n == 1 ) {
			return 0;
		}
		
		else if (n == 2) {
			return 1;
		}
		
		else {		
			
			return fib(n-1) + fib(n-2);
			
		}			
		
	}
	
	public static void main(String[] args) {
		
		FibonacciSeries f = new FibonacciSeries();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int no = s.nextInt();
		
		if (no <= 0) {
			System.out.println("Invalid number of terms.");
			
			System.exit(0);	
		}
		
		
		System.out.println("Fibonacci series upto "+no+" terms: ");
		
		for (int i = 1; i <= no; i++) {
			System.out.print(f.fib(i)+" ");
		}
		
		s.close();
		
	}

}
