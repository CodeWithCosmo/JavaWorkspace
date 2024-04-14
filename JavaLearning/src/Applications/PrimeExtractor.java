package Applications;

import java.util.Scanner;

public class PrimeExtractor {	
	
	
	public boolean is_prime(int n) {
		
		int m = n/2;
		boolean flag = true;
		for (int i=2;i<m;i++) {
				if (n%i==0) {				
					flag = false;
					break;
				}				
			}
			
			if (flag == true) {
				
				return true;
			}
			
			else {
				return false;
		}
			
	}
	
	public static void main(String[] args) {
		
		PrimeExtractor p = new PrimeExtractor();
		Scanner s = new Scanner(System.in);
		System.out.print("Upto which number do you want to extract prime numbers ? ");
		int no = s.nextInt();
		if (no < 0) {
			System.out.println("Please enter +ve number.");
			
			System.exit(0);	
		}
		
		else {
			
			for (int i=1;i<=no;i++) {
				if (p.is_prime(i) == true) {
				
					System.out.print(i+" ");
				}
			
			}		
		
		}	
		
		s.close();
	}

}
