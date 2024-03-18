package Assignments;

import java.util.Scanner;

public class ArmstrongOrNot {
	
	public boolean armstrong(int n) { 
		int copy1 = n, copy2 = n;	
		int sum = 0, rem, digits = 0;
		
		while(copy1!=0) {					
			
			digits += 1;
			rem = copy1%10; 
			copy1 = copy1/10;
		}
		
		while(copy2!=0) {
			
			rem = copy2%10;
			sum += Math.pow(rem, digits);
			copy2 = copy2/10;
			
		}
		
		if (sum == n) {
			
			return true;
		}
		else {
			
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		ArmstrongOrNot a = new ArmstrongOrNot();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no = s.nextInt();
		
		if (no < 0) {
			System.out.println("Please enter +ve number.");
			
			System.exit(0);	
		}
		
		else if (a.armstrong(no) == true) {
			
			System.out.println(no+" is a armstrong no.");
		}
		else {
			System.out.println(no+" is not a armstrong no.");
		}
		
		s.close();
	}

}
