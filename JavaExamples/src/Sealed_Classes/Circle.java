package Sealed_Classes;

public final class Circle implements Shape{
	
	final int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
}
