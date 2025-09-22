package java_17.Streams.ArrayAsList;

import java.util.Arrays;

public class RemoveEmptyString {
    public static void main(String[] args) {
        String[] inputArray = { "Hello"," ", "welcome", "to", "canada"};
        
        // use isBlank() rather than isEmpty() to eliminate blank elements along with null elements
         String[] resultArray = Arrays.stream(inputArray)
        .filter(s -> !s.isBlank())
        .toArray(String[]::new);

        System.out.println("resultArray::"+ Arrays.toString(resultArray));
    }
}
