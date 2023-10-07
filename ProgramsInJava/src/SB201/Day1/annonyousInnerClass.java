package SB201.Day1;

@FunctionalInterface
interface Int {
	void Hello(String name);
}

public class annonyousInnerClass {

	public static void main(String[] args) {

		Int i1 = new Int() {

			@Override
			public void Hello(String name) {

				System.out.println("Welcome " + name);

			}

		};
		i1.Hello("Alok");

	}
}
