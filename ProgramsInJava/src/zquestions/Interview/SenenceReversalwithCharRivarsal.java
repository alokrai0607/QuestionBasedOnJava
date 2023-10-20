package zquestions.Interview;

public class SenenceReversalwithCharRivarsal {
	
	private static void reverse(char[] arr, int start , int end){
		while (start<end) {
		char temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
		}
	}
	
	

	public static void main(String[] args) {
		
		String sen = "How are You";
		System.out.println("Original sentence is :"+sen);
		
		char[] carray = sen.toCharArray();
		reverse (carray , 0 ,carray.length-1);
		
		int start = 0;
		
		for(int end = 0 ; end < carray.length ; end++) {
			if(carray[end] == ' ') {
				reverse (carray , start , end-1);
				start = end+1 ;
			}else if (end == carray.length-1) {
				reverse(carray, start, end);
			}
		}
		
		 String ReversedSen = new String(carray);
		 System.out.println("Reverse String is : "+ReversedSen);

	}

}

