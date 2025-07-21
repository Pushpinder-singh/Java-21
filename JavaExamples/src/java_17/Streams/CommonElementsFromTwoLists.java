package java_17.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CommonElementsFromTwoLists {
    
    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> l2 = Arrays.asList(3,4,5,6,7);

       List<Integer> CommonElements =  l1.stream()
                                        .map(a -> l2.stream().filter(b -> Objects.equals(b, a)))
                                        .flatMap(s -> s)
                                        .toList();

        System.out.println("Common ELements:"+CommonElements);

        // Second approach

        List<Integer> CommonElements2 = l1.stream().filter(l2::contains)
                                            .toList();
        System.out.println("Common ELements:"+CommonElements2);


    }
}
