package com.javaexamples.oops.abstraction.inheritence;

//Child class inheriting from Animal
class Dog extends Animal {
	String breed;

	// Constructor
	public Dog(String species, String breed) {
		super(species);
		this.breed = breed;
	}



	// Overriding the makeSound method
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}

	// Additional method specific to Dog class
	public void fetch() {
		System.out.println("Dog fetches the ball");
	}
}