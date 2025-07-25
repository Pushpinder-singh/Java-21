package java_17.Streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "SWISS";

Optional<Character> FirstNonRepeatingCharacter = s.chars()
                                .mapToObj(c-> (char)c)
                                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                                .entrySet()
                                .stream()
                                .filter(entry -> entry.getValue() ==1)
                                .map(Map.Entry::getKey)
                                .findFirst();
 
 System.out.println("FirstNonRepeatingCharacter: "+FirstNonRepeatingCharacter);

                                
}
}