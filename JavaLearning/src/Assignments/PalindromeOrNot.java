package Assignments;

import java.util.Scanner;

public class PalindromeOrNot {
	
	public boolean is_palindrome(int n) {
		int x = n;
		
		int rev=0, rem;
		
		while(n!=0) {
			
			rem = n%10;
			rev = rev*10 + rem; // 1 + 0*10 = 1 , 2 + 1*10 = 12 , 1 + 12*10 = 121  
			n = n/10;
		}
		
		if (x == rev) {
			
			return true;
		}
		else {
			
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		PalindromeOrNot p = new PalindromeOrNot();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no = s.nextInt();
		
		if (no < 0) {
			System.out.println("Please enter +ve number.");
			
			System.exit(0);	
		}
		
		else if (p.is_palindrome(no) == true) {
			
			System.out.println(no+" is a palindrome no.");
		}
		else {
			System.out.println(no+" is not a palindrome no.");
		}
		
		s.close();
	}

}
