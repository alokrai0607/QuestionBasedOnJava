package zquestions.Interview.Sort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] box = {21,54,85,86,17,75,95,25,35,15,600};
		
		for(int i=0 ; i<box.length ; i++) {
			int f = 0;
			for(int j=0 ; j<box.length-i-1 ; j++) {
				if(box[j]<box[j+1]) {
					int t = box[j];
					box[j] = box[j+1];
					box[j+1] = t;
					f=1;
				}
			}
			if(f==0) {
				break;
			}
		}
		for(int a : box) {
			System.out.println(a+" ");
		}
	}

}
