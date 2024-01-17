package com.javaexamples.oops.abstraction.inheritence;





public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a Dog object
		Dog myDog = new Dog("Canine", "Labrador");

		// Using methods from the Animal class
		myDog.displayInfo(); // Output: Species: Canine
		myDog.makeSound(); // Output: Dog barks

		// Using method specific to Dog class
		myDog.fetch(); // Output: Dog fetches the ball

	}

}
