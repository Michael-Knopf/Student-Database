package StudentDatabase;

public class studentDatabase {

	public static void main(String[] args) {
		
		Student stu1 = new Student("mike", "knopf", "340560987");
		
		stu1.setCity("Louisville");
		stu1.setState("KY");
		stu1.setPhone("502-345-6789");
		
		System.out.println(stu1.toString());
	}

}

class Student {
	
	private String firstName;
	private String lastName;
	private String SSN;
	private String userID;
	private String emailID;
	private String phone;
	private String city;
	private String state;
	private static int ID = 1000;
	
	
	public Student(String firstName, String lastName, String SSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
		emailID = firstName + lastName + "@school.com";
		ID++;
		setUserID();
	}
	
	private void setUserID() {
		int random = (int)(Math.random()*10000);
		while (random<1000 || random>9000) {
			random = (int)(Math.random()*10000);
		}
		userID = ID + "" + random + SSN.substring(5, 9);
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	} 
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void enroll() {
		System.out.println("Enrolled in class");
	}
	
	public void pay() {
		System.out.println("paying tuition");
	}
	
	public void checkBalance() {
		System.out.println("checking balance of account");
		
	}
	
	public void showCourses() {
		System.out.println("Print list of courses");
	}
	
	@Override
	public String toString() {
		return "[Name: " + firstName + " " + lastName + "]\n[Email: " + emailID + "]\n" + "[Phone Number: " + phone + "]\n" + "[User ID: " + userID + "]";

	}
	
} 