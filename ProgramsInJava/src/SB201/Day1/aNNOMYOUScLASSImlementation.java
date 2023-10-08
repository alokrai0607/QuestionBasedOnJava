package SB201.Day1;

interface AC {
	
	void show();
}


public class aNNOMYOUScLASSImlementation {

	public static void main(String[] args) {

		AC ac = new AC() {

			public void show() {
				System.out.println("Hello Java");
			}

		};

		ac.show();
	}

}
