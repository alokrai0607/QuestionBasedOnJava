package zquestions.Interview;

import java.util.Scanner;

public class swap2Numberswith3rdvar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int shivam;
		
		System.out.println("Yug ke hath me diya :");
		int yug = sc.nextInt();
		
		System.out.println("Nita ke hath me diya :");
		int nita = sc.nextInt();
		
		shivam = yug;
		yug = nita;
		nita = shivam;
		
		System.out.println("Yug ke hath me gaya :"+yug);
		System.out.println("Nita ke hath me gya :"+nita);
		
	}

}
