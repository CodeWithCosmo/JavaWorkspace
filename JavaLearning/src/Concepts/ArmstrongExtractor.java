package Concepts;

import java.util.Scanner;

public class ArmstrongExtractor {
	
	public boolean is_armstrong(int n) { 
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
		ArmstrongExtractor a = new ArmstrongExtractor();
		Scanner s = new Scanner(System.in);
		System.out.println("Upto which number do you want to extract armstrong numbers ?");
		int no = s.nextInt();
		
		if (no < 0) {
			System.out.println("Please enter +ve number.");
			
			System.exit(0);	
		}
		
		else {
			
			for (int i=0;i<=no;i++) {
				if (a.is_armstrong(i) == true) {
				
					System.out.print(i+" ");
				}
			
			}		
		
		}	
		
		s.close();
	}

}
