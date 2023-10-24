package zquestions.Interview.Sort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = {21,56,25,85,75,95,58};
		
		
		for(int i=0 ; i<arr.length ; i++) {
		  boolean flag = false;
			for(int j=0 ; j<arr.length-1-i;j++) {
			
				if(arr[j]<arr[j+1]) {
				int	temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = false;
				}
				
				
			}
			if (flag = false) {
				break;
			}
		}
		
		for(int a : arr) {
			System.out.println(a+" ");
		}
	}

}
