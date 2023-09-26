package com.Java;

public class Loop {

	public static void main(String[] args) {
		    
		    int even = 0;
		    int  Odd = 0;
		    
			for(int i = 1 ; i <= 100 ; i++) {
				
				if(i%2==0) {
			        even += i	;	
				}else {
					Odd += i ;
				}
				
			}
			System.out.println("Total sum of even Number is :"+even);
			System.out.println("Total sum of Odd Number is :"+Odd);
		
		
		
		

	}

}
