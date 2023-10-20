package zquestions.Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseUsingStream {

	public static void main(String[] args) {
		List<Integer> gin = Arrays.asList(21 , 22 , 80 ,24 ,25);
		
		List<Integer> s = gin.stream().
				sorted(Collections.reverseOrder()).
				collect(Collectors.toList());
		
		
		System.out.println("reverse order array is :"+s);

	}

}
