package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// implement map interfaces
		Map<Integer,String> hMap = new HashMap<Integer,String>();
		mapUtil(hMap);
 
	}
	
	public static void mapUtil(Map<Integer,String> map) {
		//1.add key-value pairs
		map.put(101, "Steve");
		map.put(502, "Robert");
		map.put(22, "Jennifer");
		map.put(315, "Micah");
		map.put(750, "Kelly");
		
		//2. access elements
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all key-value pairs: " + map);
		
		//3. iterate through map of key-value pairs
		for (int key : map.keySet()) {
			System.out.println("key " + key + ". value " + map.get(key));
		}
	}

}
