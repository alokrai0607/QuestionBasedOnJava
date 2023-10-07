package SB201.Day1;

@FunctionalInterface
interface funct {
	abstract void sayHi(String name);
}

class X implements funct {

	@Override
	public void sayHi(String name) {
		System.out.println("welcome " + name);
	}

	public static void main(String[] args) {
		X a1 = new X();
		a1.sayHi("Alok");
	}

}
