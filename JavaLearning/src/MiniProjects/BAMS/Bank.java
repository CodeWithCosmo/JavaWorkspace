package MiniProjects.BAMS;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("\tWelcome to Kaggler National Bank\n\t\tAccount Creation");
			System.out.println("\sEnter User Name:");
			String name = s.nextLine();
			System.out.println("\sEnter initial deposit:");
			
			double balance = s.nextDouble();
			long leftLimit = 10011100789L;
			long rightLimit = 10011102089L;
			long account_no = leftLimit + (long) (Math.random() * (rightLimit - leftLimit)); //* Math random() returns a double value in range [0,1). 
			SavingAccount account = new SavingAccount(account_no,name,balance);
			
			while (true) {
				
				System.out.println("\n\t1. Deposit\n\t2. Withdrawl\n\t3. Balance\n\t4. Details\n\t5. Exit\n\nEnter your choice: ");
				String choice = s.next();
				
				
				switch (choice) {	
				
					case "1":				
						System.out.println("Enter balance you want to deposit:");
						balance = s.nextDouble();	
						account.deposit(balance);
						break;
						
					case "2":
						System.out.println("Enter balance you want to withdrawl:");
						balance = s.nextDouble();	
						account.withdrawl(balance);
						break;
						
					case "3":
						account.balance();
						break;
						
					case "4":
						account.getDetails();
						break;
						
					case "5":
						System.exit(0);
						break;
						
					default:
						System.out.println("Invalid choice !");
					
				}
			}
		}
	}

}
