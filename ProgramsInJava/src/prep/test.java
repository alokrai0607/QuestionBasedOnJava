package prep;

public class test {

	public static void main(String[] args) {
		String input = "Hello";
		int[] frequencey = new int[256];
		//calcute freq
		for(int i=0 ; i<input.length();i++) {	
			char ch = input.charAt(i);
			frequencey[ch]++;
			
		}
		// print the freq
		
		for(int i=0 ; i<frequencey.length ; i++) {
			if(frequencey[i]>0) {
				System.out.println((char)i+":"+frequencey[i]);
			}
		}
	
	}
}
