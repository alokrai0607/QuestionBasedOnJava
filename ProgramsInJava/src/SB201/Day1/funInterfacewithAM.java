package SB201.Day1;

@FunctionalInterface
interface Inter {
	// abstract method
	void sayHello(String name);

	// default method
	default void function1() {
		System.out.println("I am from default function1 ");
	}

	static void function2() {
		System.out.println("I am from void function2 ");
	}

}

class funInterfacewithAM implements Inter {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello from " + name);
	}

	public static void main(String[] args) {

		Inter a = new funInterfacewithAM();
		// we can call directly abstract and default method by making object .
		a.sayHello("Alok");
		a.function1();
		
		// but we can call static method directly . there was need to calling static method using 
		 //  interface also .
		Inter.function2();
	}

}
