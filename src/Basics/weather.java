package Basics;

public class weather {
	public static void main(String[] args) {
		//suggest clothing based on climate
		int temperature = 80;
		String sunCondition = "";
		
		if(temperature>=80) {
			System.out.println("its hot wear shorts and a t-shirt");
			if(sunCondition != "sunny") {
				System.out.println("dress for rain");
			}
		} else if(temperature>=60&&temperature<80) {
			System.out.println("its pleasant wear long pants and a tshirt");
		} else {
			System.out.println("pretty cold, dress warm");
		}
	}
}
