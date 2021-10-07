package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCheck {


	public static void main(String[] args){
		
		String fileName = "C:\\Users\\Workspace\\Documents\\SDET University\\text\\passwords.txt";
		File file = new File(fileName);
		String[] passwords = new String[13];
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i=0; i<passwords.length; i++){
				passwords[i] = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("error: file not found");
		} catch (IOException e) {
			System.out.println("error: could not read file");
			e.printStackTrace();
		}
		
		for(String password : passwords) {
			boolean hasNum = false;
			boolean hasLet = false;
			boolean hasChar = false;
			
			for(int n=0; n<password.length();n++) {
				if("0123456789".contains(password.substring(n,n+1))) {
					hasNum = true;
				} else if ("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n,n+1).toLowerCase())) {
					hasLet = true;
				} else if ("!@#$^%&*_+=-;.<>?/".contains(password.substring(n,n+1))) {
					hasChar = true;
				}
			
			
			}
			try {
				if(hasNum && hasLet && hasChar) {
					System.out.println("password accepted");
				} else if (!hasNum) {
					throw new NumberException(password);
				} else if (!hasLet) {
					throw new LetterException(password);
				} else if (!hasChar) {
					throw new CharacterException(password);
				}

			} catch (NumberException e) {
				System.out.println(e.toString());
			} catch (LetterException e) {
				System.out.println(e.toString());
			} catch (CharacterException e) {
				System.out.println(e.toString());
			}
	}
		
}
}

class NumberException extends Exception {
	String pw;
	
	NumberException(String pw) {
		this.pw = pw;
	}
	
	public String toString() {
		return ("NumberException: " + pw);
	}
}

class LetterException extends Exception {
	String pw;
	
	LetterException(String pw) {
		this.pw = pw;
	}
	
	public String toString() {
		return ("LetterException: " + pw);
	}
}

class CharacterException extends Exception {
	String pw;
	
	CharacterException(String pw) {
		this.pw = pw;
	}
	
	public String toString() {
		return ("CharacterException: " + pw);
	}
}
	

