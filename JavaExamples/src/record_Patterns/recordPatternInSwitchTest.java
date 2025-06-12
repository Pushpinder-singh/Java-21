package record_Patterns;

public class recordPatternInSwitchTest {

	public static void main(String[] args) {
		
		//Object obj = new Employee("Kabir", 32, "Brampton");
		
	    Object obj = new Person("Pushpinder", 33, new Address("LA", "USA"));
		
	    // Here object can be matched as per the record pattern
	    
		switch(obj) {
		case Person(String name, int age, Address(String city, String country))
        -> System.out.println(name + " lives in " + city + ", " + country);

		case Employee(String name, Integer age, String city)
        -> System.out.println(name +" is "+ age + " years Old and lives in city " + city);

        default -> System.out.println("Unknown object");
		}
		
		
		
		
	}

}
