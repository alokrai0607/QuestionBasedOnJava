package zquestions.Interview.Sort;



public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 21, 54, 28, 56, 97, 52, 88, 11, 0 };

		for(int i=0 ; i<arr.length ; i++) {
			int current = i ;
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[j]<arr[current]) {
					current = j;
				}
			}
			  int dummy = arr[i];
			  arr[i] = arr[current];
			  arr[current] = dummy ; 
			
		}
		for(int  k : arr) {
			System.out.println(k+" ");
		}
	}

}
