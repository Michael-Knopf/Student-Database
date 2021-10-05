package Basics;

public class salaryCalculator {
	public static void main(String[] args) {
		//lets create a variable to define our career
		
		String career;
		System.out.println("Program is starting");
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		
		int hoursPerWeek = 40;
		int weeksPerYear = 52;
		double rate = 42.50;
		// compute annual salary
		// rate * hours/week * weeks/year
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salery: $" + salary);
	}
}
