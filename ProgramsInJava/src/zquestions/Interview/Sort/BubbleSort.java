package zquestions.Interview.Sort;

public class BubbleSort {
    public static void main(String args[]) {
      int[] arr = {1,8 , 7 , 6 , 25 , 85 ,0 , 25};
      
      for(int i=arr.length-1 ; i>=0 ; i--) {
    	  for(int j=0 ; j<=i-1 ; j++) {
    		  if(arr[j]<arr[j+1]) {
    			  int temp = arr[j];
    			  arr[j] = arr[j+1];
    			  arr[j+1] = temp;
    		  }
    	  }
    	  }
    	  for (int l : arr) {
    		  System.out.println(l+" ");
    	  }
      }
    }


