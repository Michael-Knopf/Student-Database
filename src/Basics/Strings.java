package Basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "Lord of the Rings";
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("the book contains the word rings");
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("the browser is chrome");
		}
		
		String name = "mike";
		String lastName = "knopf";
		String SSN = "123456789";
		
		System.out.println("There are " + SSN.length() + " digits in the SSN");
		
		//print initials and last four ssn
		System.out.println(name.substring(0,1));
		System.out.println(lastName.substring(0,1));
		System.out.println(SSN.substring(5,9));
	}

}
