package oop;

public class bankAccount implements IRate {

	String accountNumber;
	private static final String routingNumber = "984536";
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	bankAccount(){
		System.out.println("new acct created");
	}
	
	bankAccount(String accountType){
		System.out.println("new account type: " + accountType);
	}
	
	bankAccount(String accountType, double initDeposit){
		System.out.println("new account type: " + accountType);
		System.out.println("new account initial deposit: " + initDeposit);
		String Msg = "";
		if(initDeposit<1000) {
			Msg = "Error: Minimum First Deposit is $1,000.00";
		} else {
			Msg = "Thanks for your initial deposit of $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
		System.out.println("Balance : $" + balance);
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//Interface Methods
	public void setRate() {
		System.out.println("setting rate");
	}
	public void increaseRate() {
		System.out.println("increasing rate");
	}
	
	
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("Withdrawl");
	}
	
	private void showActivity(String activity) {
		System.out.println("Your most recent transaction: " + activity);
		System.out.println("Your new balance: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance : $" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + ". Account#: " + accountNumber + ". Routing#: " + routingNumber + ". Balance: $" + balance + " ]";
	}
	
	
}
