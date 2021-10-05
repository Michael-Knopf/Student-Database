package Basics;

public class Cities {

	public static void main(String[] args) {
//		String[] cities = {"new york", "san fran", "louisville", "dc"};
//		System.out.println(cities[3]);
//
//		
//		String[] states = new String[5];
//		states[0] = "cali";
//		states[1] = "kentucky";
//		states[2] = "indiana";
//		states[3] = "florida";
//		states[4] = "south carolina";
//		System.out.println(states[3]);
//		
//		String[] countries;
//		countries = new String[3];
//		countries[1] = "usa";
//		countries[2] = "canada";
//		countries[3] = "uk";
		

		String[] states = new String[5];
		states[0] = "cali";
		states[1] = "kentucky";
		states[2] = "indiana";
		states[3] = "florida";
		states[4] = "south carolina";
		
		int i = 0;
		
		//do loop enters loop then tests condition
		do {
			System.out.println("state: " + states[i]);
			i = i + 1;
		} while (i<5);
		
		System.out.println("***********");
		
		//while loop tests condition then enters loop
		int n = 0;
		boolean stateFound = false;
		while(!stateFound) {
			String state = states[n];
			System.out.println(state);
			if(state == "florida") {
				System.out.println("state found");
				stateFound = true;
			}
			n++;
		}
		
		System.out.println("*************");
		
		//for loop best for arrays
		for(int x=0; x<5; x++) {
			System.out.println(states[x]);
		}
	}

}
