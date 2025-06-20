package java_17.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String> sentences  = Arrays.asList("Java Stream", "Streams API", "Map vs Flatmap");
	
	List<List<String>> mapped = sentences.stream()
            .map(sentence -> Arrays.asList(sentence.split(" ")))
            .collect(Collectors.toList());
	
		System.out.println("Using map():");
		System.out.println(mapped);

		
	List<String> flatMapped = sentences.stream()
			.flatMap(sentence -> Arrays.stream(sentence.split(" ")))
			.collect(Collectors.toList());
		
		System.out.println("Using  flatMap():");
		System.out.println(flatMapped);

	}

}
