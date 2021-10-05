package oop;

public class Demo {

	public static void main(String[] args) {
		
		Person person1 = new Person();
			person1.name = "joe";
			person1.email= "joe@gmail.com";
			person1.phone= "123456789";
			
			person1.walk();
			person1.sleep();
			person1.eat();
		
		
	}

}

class Person {
	String name;
	String email;
	String phone;
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}