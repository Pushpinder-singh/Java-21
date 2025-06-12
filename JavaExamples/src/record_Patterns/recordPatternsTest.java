package record_Patterns;

record Address(String city, String country) {}
record Person(String name, int age, Address address) {}

public class recordPatternsTest {

	public static void main(String[] args) {
		
		/*
		 * Record patterns in Java 21 allow 
		 * you to deconstruct record values directly within pattern-matching constructs.
		 * */
		
		Object obj = new Person("Singh", 30, new Address("LA","USA"));

        if (obj instanceof Person(String name, int age, Address address)) {
            System.out.println("Name: " + name + ", Age: " + age + " Address : "+address);
        }
	}

}
