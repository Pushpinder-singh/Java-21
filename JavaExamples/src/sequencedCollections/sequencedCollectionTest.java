package sequencedCollections;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class sequencedCollectionTest {

	public static void main(String[] args) {
		
		
		// SequencedCollection: Extends Collection to ensure a defined order of elements.
		SequencedCollection<String> names = new ArrayList<>();  
	       
	       // Adding elements  
	       names.addFirst("Robert");  
	       names.addLast("Bob"); 
	       names.addFirst("Champ"); 
	       names.addLast("Mickey");
	       
	       // Accessing elements 
	       System.out.println("First Element : " + names.getFirst());  
	       System.out.println("Last Element  : " + names.getLast()); 

	       // Removing elements
	       names.removeFirst();   
	       System.out.println("After removeFirst: " + names); 

	       names.removeLast();   
	       System.out.println("After removeLast: " + names); 
	       
	       SequencedCollection<String> reversed = names.reversed();
	        System.out.println("Reverse of Collection:: "+reversed);
	}

}
