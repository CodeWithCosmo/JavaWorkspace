package MiniProjects.BAMS;

public class BankAccount {
	
	protected long account_number;
	protected String account_holder_name;
	protected double balance;
	
	BankAccount(){
		System.out.println("Account registered Successfully !\n");
	}
	
	void deposit(double balance) {
		
		this.balance += balance;
		System.out.println(balance+" USD deposit Success !");
	}
	
	void withdrawl(double balance) {
		
		if (this.balance >= balance) {
			
			this.balance = this.balance - balance;
			System.out.println(balance+ " USD withdrawl Success !");
		}
		
		else
			System.out.println("Insufficient balance !");
	}
	
	void balance() {
		
		System.out.println("Balance: "+this.balance+" USD");
	}

}
