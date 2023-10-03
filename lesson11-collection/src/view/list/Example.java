package view.list;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Example {
	public static void main(String[] args) {

		// create a hashmap
		HashMap<Integer, String> languages = new HashMap<>();

		// add elements to hashmap
		languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");

		// print elements in hashmap
		System.out.println("HashMap: " + languages);

		// get() method to get value
		String value = languages.get(1);
		System.out.println("Value at index 1: " + value);

		// return set view of keys
		// using keySet()
		System.out.println("Keys: " + languages.keySet());

		// return set view of values
		// using values()
		System.out.println("Values: " + languages.values());

		// return set view of key/value pairs
		// using entrySet()
		System.out.println("Key/Value mappings: " + languages.entrySet());

		// change element with key 2
		languages.replace(2, "C++");
		System.out.println("HashMap using replace(): " + languages);
		
		// remove element associated with key 2
	    String value1 = languages.remove(2);
	    System.out.println("Removed value: " + value1);

	    System.out.println("Updated HashMap: " + languages);
	    
		// iterate through keys only
	    System.out.print("Keys: ");
	    for (Integer key : languages.keySet()) {
	      System.out.print(key);
	      System.out.print(", ");
	    }

	    // iterate through values only
	    System.out.print("\nValues: ");
	    for (String value11 : languages.values()) {
	      System.out.print(value11);
	      System.out.print(", ");
	    }
	    
	    // iterate through key/value entries
	    System.out.print("\nEntries: ");
	    for (Entry<Integer, String> entry : languages.entrySet()) {
	      System.out.print(entry);
	      System.out.print(", ");
	    }
		
		 // create a treemap
	    TreeMap<String, Integer> evenNumbers = new TreeMap<>();
	    evenNumbers.put("Two", 2);
	    evenNumbers.put("Four", 4);
	    System.out.println("TreeMap: " + evenNumbers);

	    // create hashmap from the treemap
	    HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
	    numbers.put("Three", 3);
	    System.out.println("HashMap: " + numbers);
	}
}
