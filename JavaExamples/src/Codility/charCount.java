package Codility;

import java.util.LinkedHashMap;
import java.util.Map;

public class charCount {

     public static void main(String[] args) {
        String s = "ababcdcd";

        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Print unique characters and their frequency
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    
}
