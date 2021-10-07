package exceptionsFiles;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		double payment = 0;
		boolean positivePymt = true;
		
		
		do {
			// 1. ask user for input
			System.out.print("enter payment amount: ");
		
			//2. get the amount and test the value
			Scanner in = new Scanner(System.in);
			//3. handle exceptions appropriately
			try {
				payment = in.nextDouble();
				if (payment<0) {
					throw new NegotivePaymentException(payment);
					} else { positivePymt = true;}
			} catch (NegotivePaymentException e) {
				System.out.println(e.toString());
				System.out.println("please try again");
				positivePymt = false;
			}
		} while(!positivePymt);
		
		
		
			
		
		//4. print confirmation
		
		System.out.println("Thank you for your payment of $" + payment);
	}

}
