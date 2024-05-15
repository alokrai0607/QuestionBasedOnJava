package Monocept;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class program {

	public static void main(String[] args) {
		String sentence = "hi i am alok";

		Map<String, Long> wordCountMap = Arrays.stream(sentence.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
	}
}
