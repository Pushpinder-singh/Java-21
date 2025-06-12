package sequencedCollections;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class sequencedMapTest {

	public static void main(String[] args) {
		/* SequencedMap is useful for the Map interfaces & classes.
		It does not extend the SequencedCollection, 
		but provides its own methods that apply the access order to map entries
		 */
		
		SequencedMap<String, Integer> map = new LinkedHashMap<>();

	       // Adding entries
	       map.putFirst("Alka", 25);
	       map.putLast("Mahesh", 30);
	       map.putLast("Tanveer", 35);
	       map.putFirst("Malik", 25);
	       map.putLast("Gupta", 30);
	       map.putLast("Bhargavi", 28);
	       System.out.println("Map Elements ::"+map);
	       
	       
	       // Accessing first and last entries
	       System.out.println("First Entry: " + map.firstEntry()); 
	       System.out.println("Last Entry: " + map.lastEntry()); 
	   
	      // Removing entries
	       map.pollFirstEntry();
	       System.out.println("After removeFirst: " + map); 
	       map.pollLastEntry();
	       System.out.println("After removeLast: " + map); 
	       
	       SequencedMap<String, Integer> reversed = map.reversed();
	       System.out.println("Reverse of a Map:: "+reversed); 
	}

}
