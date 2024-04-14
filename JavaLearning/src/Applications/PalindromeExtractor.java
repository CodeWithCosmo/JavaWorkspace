package Applications;

import java.util.Scanner;

public class PalindromeExtractor {
	
	public boolean is_palindrome(int n) {
		int x = n;
		
		int rev=0, rem;
		
		while(n!=0) {
			
			rem = n%10;
			rev = rev*10 + rem;
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
		PalindromeExtractor p = new PalindromeExtractor();
		Scanner s = new Scanner(System.in);
		System.out.print("Upto which number do you want to extract palindrome numbers ? ");
		int no = s.nextInt();
		
		if (no < 0) {
			System.out.println("Please enter +ve number.");
			
			System.exit(0);	
		}
		else {
			
			for (int i=0;i<=no;i++) {
				if (p.is_palindrome(i) == true) {
				
					System.out.print(i+" ");
				}
			
			}		
		
		}
		s.close();
	}
}
