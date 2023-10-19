package zquestions.Interview;

public class ReturnInteger {

	public static void main(String[] args) {
		
		int a = 12345;
		int st = 0;
		int rem = 0;
		while(a>0) {
			rem = a%10;
			st = ((st*10)+rem);
			a /= 10;	
		}
		System.out.println("Reverse Number will be :"+st);
	}
}
