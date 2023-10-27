package zquestions.Interview.Sort;

public class BubbleSortAlgoForString {

    public static void main(String[] args) {

        String[] a = {"ziya", "roshni", "alok", "Tanay", "ashish"};

         for(int i=0 ; i<a.length ; i++) {
        	 int f = 0 ;
        	 for(int j=0 ; j<a.length-1-i ; j++) {
        		 
        		 if(a[j].compareToIgnoreCase(a[j+1])>0) {
        			 String t = a[j];
        			 a[j] = a[j+1];
        			 a[j+1] = t ;
        			 f = 1;
        		 }
        	 }
        	 if(f==0) {
        		 break;
        	 }
         }
         for(String k : a) {
        	 System.out.println(k+" ");
         }
        
        
    }
}
