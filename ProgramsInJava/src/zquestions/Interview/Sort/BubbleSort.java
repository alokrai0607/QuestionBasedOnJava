package zquestions.Interview.Sort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] inti = {21,52,75,90,80,57,25,33,64,690};
		int c = inti.length-1;
		
		for(int i=0 ; i<c ; i++) {
			int f = 0;
			for(int  j=0 ; j<c ; j++) {
				
				//for reverse order
				//if(inti[j]<inti[j+1]) {
				// for increasing order
				if(inti[j]>inti[j+1]) {
					
					int t = inti[j];
					inti[j] = inti[j+1];
					inti[j+1] = t;
					f = 1;
					
				}
				
			}
			if(f == 0) {
				break;
			}
			for(int k : inti) {
				System.out.println(k+" ");
			}
		}
		
		
		
	}

}
