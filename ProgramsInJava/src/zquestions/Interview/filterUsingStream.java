package zquestions.Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterUsingStream {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(15,20,80,3,90);
		
		List<Integer> odd = num.stream()
				.filter(n -> n%2==1)
				.collect(Collectors.toList());	
		
	   System.out.println("Odd Numbers"+odd);
	}

}
