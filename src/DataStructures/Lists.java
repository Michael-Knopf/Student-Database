package DataStructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		
		//1.create a collection
		ArrayList<String> cities = new ArrayList<String>();
		
		//2.add some elements
		cities.add("Clevland");
		cities.add("Toronto");
		cities.add("Chicago");
		cities.add("Miami");
		
		//3. iterate through collection
		for (String city : cities) {
			System.out.println(city);
		}
		
		//4. get the size
		int size = cities.size();
		System.out.println("there are " + size + " cities in the array");
		
		//5. retrieve specific elements
		System.out.println(cities.get(2));
		
		//6. remove
		cities.remove(0);
		size = cities.size();
		System.out.println("now there are " + size + " cities in the array");
		for (String city : cities) {
			System.out.println(city);
		}
		
		
	}

}
