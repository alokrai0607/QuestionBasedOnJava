package InterviewBit;


interface Animal {
 void eat();
 void sleep();
}

class Dog implements Animal{
 @Override
 public void eat() {
     System.out.println("Dog is eating");
 }

 @Override
 public void sleep() {
     System.out.println("Dog is sleeping");
 }
}


public class Main {
 public static void main(String[] args) {
     Animal myDog = new Dog();
     myDog.eat();
     myDog.sleep();
     
 }
}
