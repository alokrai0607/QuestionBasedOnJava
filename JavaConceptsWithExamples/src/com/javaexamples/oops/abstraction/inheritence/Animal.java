package com.javaexamples.oops.abstraction.inheritence;

//Parent class
class Animal {
	String species;

	// Constructor
	public Animal(String species) {
		this.species = species;
	}

	// Method to make a sound
	public void makeSound() {
		System.out.println("Animal makes a sound");
	}

	// Method to display information about the animal
	public void displayInfo() {
		System.out.println("Species: " + species);
	}
}