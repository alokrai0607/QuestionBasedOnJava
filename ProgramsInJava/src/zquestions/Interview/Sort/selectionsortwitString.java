package zquestions.Interview.Sort;

public class selectionsortwitString {

	public static void main(String[] args) {
		String[] a = {"manyata" , "dravyansh" , "ayush" , "lucky" , "choti", "ritika"};
		
		for(int i = 0 ;i < a.length ; i++) {
			int min = i ; 
			for(int j=i+1 ; j<a.length ; j++) {
				
				if(a[j].compareToIgnoreCase(a[min])>0) {
					
					min = j ; 
				}
			}
			String temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			
			
		}
		  for(String you : a) {
			  System.out.println(you+" ");
		  }

	}

}
