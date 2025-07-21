package java_17.Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class UnionOfTwoLists {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(10,20,30,40,40,50);
        List<Integer> l2 = Arrays.asList(60,70,80,80,70,90,100);

        List<Integer>  Union = Stream.of(l1,l2)
                                    .flatMap(Collection::stream)
                                    .distinct()
                                    .sorted(Comparator.reverseOrder())
                                    .toList();
     System.out.println("Union Of lists:: "+Union);  
     
     

//Solution 2
        List<Integer> unionDescList1 =
                 Stream.concat(l1.stream(),l2.stream()) //Combine 2 lists
                .distinct() // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .toList(); // Collect as list
        System.out.println("Union (Descending): Solution 2 - "  + unionDescList1);




    }

}
