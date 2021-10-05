package oop;

public class bankAccountApp {

	public static void main(String[] args) {
		// create a new bank account
		bankAccount acc1 = new bankAccount();
		acc1.accountNumber = "23456789";
		
		acc1.setName("Mike Knopf");
		System.out.println(acc1.getName());
		acc1.setSsn("205689743");
		System.out.println("SSN: " + acc1.getSsn());
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		
		
//		System.out.println(acc1.toString() );
		
		bankAccount acc2 = new bankAccount("Checking");
		acc2.accountNumber = "23834789";
		

		bankAccount acc3 = new bankAccount("checking", 2200.00);
		acc3.accountNumber = "23956789";
		
		//
//		acc3.checkBalance();
//
//		
//		CDAccount cd1 = new CDAccount();
//		cd1.balance = 3000.00;
//		cd1.interestRate = "4.5";
//		cd1.name = "Juan";
//		cd1.accountType = "CD Account";
//		System.out.println(cd1.toString());
//		cd1.compount();
//		
	}

}
