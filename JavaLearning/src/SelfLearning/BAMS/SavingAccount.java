package SelfLearning.BAMS;

public class SavingAccount extends BankAccount {
	
	@SuppressWarnings("unused")
	private final static float interest_rate = 6.5f;
	
	SavingAccount(long account_number,String account_holder_name,double balance) {
		
		super();
		this.account_number = account_number;
		this.account_holder_name = account_holder_name.toUpperCase();
		super.deposit(balance);
	}
	
	protected void getDetails() {
		
		System.out.println("Account Number: "+ this.account_number);
		System.out.println("Account Holder Name: "+ this.account_holder_name);
	}

}
