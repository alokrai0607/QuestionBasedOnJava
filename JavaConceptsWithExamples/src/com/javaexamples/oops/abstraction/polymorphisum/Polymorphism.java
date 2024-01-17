package com.javaexamples.oops.abstraction.polymorphisum;

public class Polymorphism {
	
	public static void main(String[] args) {
        // Creating objects of different classes
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        // Calling the sound method on each object
        animal1.sound(); // Output: Animal makes a sound
        animal2.sound(); // Output: Dog barks
        animal3.sound(); // Output: Cat meows
    }

}
