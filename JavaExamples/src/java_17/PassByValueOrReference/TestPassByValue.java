package java_17.PassByValueOrReference;

public class TestPassByValue {

    public static void main(String[] args) {
        
    	EmployeeDTO emp=new EmployeeDTO("Test",1);
		System.out.println("before updating name - "+emp.getName());
		updateValue(emp);
		System.out.println("after updating name - "+emp.getName());
		
		
		String name="Demo";
		System.out.println("before - "+name);
		update(name);
		System.out.println("after - "+name);
	
	}
	public static void updateValue(EmployeeDTO e) {
		//e= new EmployeeDTO("Pushpinder",2); // new object will not change the original state.
		e.setName("Pushpinder_Singh"); // e referes to the copy of original reference so state changes
		
	}
	
	public static void update(String name) {
		name="demo1";
		
	}

}

/*In Java, everything is pass-by-value.
But the confusion happens because:

For primitive types (int, double, char, etc.), Java passes a copy of the actual value.
For objects, Java passes a copy of the reference (memory address).

That means:

You cannot change the original primitive value from a method.
But you can modify the object's internal state using the copied reference. */



