package Sealed_Classes;

public class SealedMainExample {

	public static void main(String args[]) {
	Shape circle = new Circle(15);
	
	System.out.println("Radius: "+circle.getClass());
	
}
}