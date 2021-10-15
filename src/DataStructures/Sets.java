package DataStructures;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		//1. define collection
		//TreeSet is stored in alphabetical order
		//LinkedHashSet is stored in order they are entered
		Set<String> animals = new HashSet<String>();
		 
		//2. add elements
		animals.add("dog");
		animals.add("pig");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");
		
		System.out.println(animals + " " + animals.size());
		
		animals.add("hog");
		animals.add("cat");
		animals.add("goose");
		
		System.out.println(animals + " " + animals.size());

		//create a new set for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		
		//what is the intersection between animals and farmAnimals
		//1. copy existing set into new set
		Set<String> intersectionSet = new HashSet<String>(animals); 
		//2.retain only elements that are also in other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("the intersection is " + intersectionSet);
		
		//what is the union
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("the union is " + unionSet + unionSet.size());
		
		//what is the difference between sets
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.remove(farmAnimals);
		System.out.println("the difference is " + differenceSet + differenceSet.size());
	}

}
