package CollectionsFremwork.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Watermelon");
        list.add("Lemon");
        list.add("Cherry");

        List<String> sortedList = list.stream()
                                      .sorted()
                                      .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}
