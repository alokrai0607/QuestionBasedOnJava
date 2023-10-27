package zquestions.Interview.Sort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 21, 56, 25, 85, 75, 95, 58, 21, 56, 25, 85, 75, 95, 5821, 56, 25, 85, 75, 95, 58 };

		for(int i=0 ; i<arr.length ; i++) {
			
			boolean f = false ; 
			for(int  j=0 ; j<arr.length-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					int tem = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tem;
					f=true;
				}
			}
			if(!f) {
				break;
			}
		}
		for(int k : arr) {
			System.out.println(k+" ");
		}
	}

}
