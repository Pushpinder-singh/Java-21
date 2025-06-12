package record_Patterns;

public class patternMatchingSwitchTest {
	
	public static void main(String[] args) {
	
		//	Object obj = "Hello, Java!";
		
		Object obj = 43;
		
        switch (obj) {
            case String s -> System.out.println("It's a string: " + s);
            case Integer i -> System.out.println("It's an integer: " + i);
            default -> System.out.println("Unknown type");
        }
	}

}
