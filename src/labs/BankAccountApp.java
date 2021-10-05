package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("234567890", 1000);
		BankAccount acc2 = new BankAccount("454445590", 1500);
		BankAccount acc3 = new BankAccount("704587650", 3000);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		
		System.out.println(acc1.toString());

	}

}

class BankAccount implements IInterest {
	   
	private static int ID = 1000;                //internal id  
	private String accountNumber;  //id + random 2 digit number + first 2 of SSN
	private static final String routingNumber = "00456732";
	private String name;
	private String SSN;
	private double balance;
	
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
		if(random<10) {
			random = random + 9;
		};
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("New Balance: " + balance);
	}

	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
	}

	
	
}