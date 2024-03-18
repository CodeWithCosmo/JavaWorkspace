package Assignments;

import java.util.Scanner;

public class PrimeOrNot {	
	
	
	public void prime(int n) {
		int m = n/2;
		boolean flag = true;
		for (int i=2;i<m;i++) {
				if (n%i==0) {				
					flag = false;
					break;
				}				
			}
			
			if (flag == true) {
				System.out.println(n+" is a prime number.");			
			}
			
			else {
				System.out.println(n+" is not a prime number.");
			}
		}	
	public static void main(String[] args) {
		
		PrimeOrNot p = new PrimeOrNot();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no = s.nextInt();
		
		if (no < 0) {
			System.out.println("Please enter +ve number.");
			
			System.exit(0);	
		}
		
		p.prime(no);		
		
		s.close();
		
	}

}
