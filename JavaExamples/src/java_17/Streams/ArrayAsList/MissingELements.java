package java_17.Streams.ArrayAsList;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingELements {
    public static void main(String[] args) {
        int[] list = {2,2,1,3,3,5,7,7,9,8};
        
        Set<Integer> set = Arrays.stream(list)
                            .boxed()
                            .collect(Collectors.toSet());
    System.out.println("Set::: "+set);
                        
List<Integer> resultList = IntStream.rangeClosed(1, 9)
.filter(i -> !set.contains(i))
.boxed()
.toList();


System.out.println("resultList:: "+resultList);
}

    
}
