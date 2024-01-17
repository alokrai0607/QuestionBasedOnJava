package com.javaexamples.oops.abstraction;

//Abstract class representing a shape
abstract class Shape {
	// Abstract method for calculating area
	public abstract double calculateArea();

	// Abstract method for displaying information about the shape
	public abstract void displayInfo();
}

//Concrete class Circle extending the abstract class Shape
class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public void displayInfo() {
		System.out.println("Circle - Radius: " + radius + ", Area: " + calculateArea());
	}
}

//Concrete class Square extending the abstract class Shape
class Square extends Shape {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return side * side;
	}

	@Override
	public void displayInfo() {
		System.out.println("Square - Side: " + side + ", Area: " + calculateArea());
	}
}

//Main class to demonstrate abstraction
public class Abstraction {
	public static void main(String[] args) {
		// Creating objects of concrete classes
		Circle circle = new Circle(5.0);
		Square square = new Square(4.0);

		// Using abstract class reference to achieve abstraction
		Shape shape1 = circle;
		Shape shape2 = square;

		// Calling abstract methods without knowing the concrete implementation
		shape1.displayInfo(); // Output: Circle - Radius: 5.0, Area: 78.53981633974483
		shape2.displayInfo(); // Output: Square - Side: 4.0, Area: 16.0
	}
}
