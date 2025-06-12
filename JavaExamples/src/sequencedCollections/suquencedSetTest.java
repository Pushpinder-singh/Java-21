package sequencedCollections;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class suquencedSetTest {
	
	public static void main(String... args){
	
	//SequencedSet: Extends Set to ensure a defined order of elements without duplicates.
	SequencedSet<String> set = new LinkedHashSet<>();

    // Adding elements
    set.addFirst("Alka");
    set.addLast("Singh");
    set.addFirst("Charlie");
    set.addFirst("Preet");
    set.addLast("Singh");
    set.addFirst("Preet");

    System.out.println("Elements::   "+set);
    
    // Accessing elements
    System.out.println("First Element: " + set.getFirst());
    System.out.println("Last Element :  " + set.getLast());

    // Removing elements
    set.removeFirst();
    set.removeLast();
    System.out.println("Remaining: " + set);
    
    SequencedSet<String> reversed = set.reversed();
    System.out.println("Reverse of Elements:: "+reversed);
 
	}

}
