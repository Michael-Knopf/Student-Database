package DataStructures;

public class Arrays {

	public static void main(String[] args) {
//		String[] alphabet = {"a", "b", "c", "d", "e"};
//
//		for (int i=0; i<5; i++) {
//			System.out.println(alphabet[i]);
//		}
//		
//		for (int n=0; n<alphabet.length; n++) {
//			System.out.println(alphabet[n]);
//		}
//		
//		for (String letter : alphabet) {
//			System.out.println(letter);
//		}
		
		String[][] users = {{"John", "Williams", "jw@gmail.ccom", "1234567890"}, 
				{"Sarah", "Jackson", "sj@gmail.com", "2345678901"},
				{"Mike", "Knopf", "mk@gmail.com", "3456789012"}
		};
		
		//get size of array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number od users: " + numOfUsers);
		System.out.println("Number of Fields: " + numOfFields);
		
		//traverse double array
		for(int i = 0; i<numOfUsers; i++) {
				String firstName = users[i][0];
				String lastName = users[i][1];
				String eMail = users[i][2];
				String phone = users[i][3];
				System.out.println(firstName + " " + lastName + " " + eMail + " " + phone);
		}
		//using for each
		for(String[] user : users) {
			System.out.print("[ ");
			for(String field : user) {
				System.out.print(field + " ");
			}
			System.out.println(" ]");
		}
	}

}
