package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreditCardStatement {

	public static void main(String[] args) {
		List<String[]> transactions = new ArrayList<String[]>();
		String filename = "C:\\Users\\Workspace\\Documents\\SDET University\\text\\CreditCardStatement.csv";
		String datarow;
		double balance = 0;
		
		try {
			//open file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			//read data as long as its not empty
			while ((datarow = br.readLine()) != null) {
				//parse data by commas
				String[] line = datarow.split(",");
				//add data to collection
				transactions.add(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
 
	
	
		for (String[] transaction : transactions) {
			String date = transaction[0];
			String type = transaction[1];
			String vendor = transaction[2];
			double amount = Double.parseDouble(transaction[3]);
			System.out.print(date +  " " + type + " " + vendor + " $" + amount);
			
			if(type.equalsIgnoreCase("credit")) {
				balance = balance + amount;
			} else if (type.equalsIgnoreCase("debit")) {
				balance = balance - amount;
			} else {
				System.out.println("Some other transaction");
			}
			System.out.print(" [Current Balance: " + balance + "] \n");
		}
		if (balance>0) {
			System.out.println("You have a balance of " + balance);
			System.out.println("You are being charged a 10% fee of " + balance*.1);
			System.out.println("New balance: " + balance*1.1);
			balance = balance*1.1;
		} else if (balance<0) {
			System.out.println("Thanks for your payment.");
			System.out.println("You have an overpayment of $" + balance);
		} else {
			System.out.println("Thanks for your payment");
		}
		
	}
	
}
