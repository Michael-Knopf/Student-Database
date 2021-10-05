package Basics;

public class numbersCalc {
	
	public static void main(String[] args) {
		printName();
		int numA =10;
		int numB = 20;
		addNumbers(numA, numB);
		multiplyNumbers(numA, numB);
		System.out.println(multiplyNumbers(numA, numB));
	}
	
	static void printName() {
		System.out.println("my name is mike");
	}
	
	static void addNumbers(int numA, int numB) {
		int sum = numA + numB;
		System.out.println(sum);
	}
	
	static int multiplyNumbers(int numA, int numB) {
		int product = numA * numB;
		return product;
	}
	
}
