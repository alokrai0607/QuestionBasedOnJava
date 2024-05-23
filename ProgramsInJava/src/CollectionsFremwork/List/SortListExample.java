package CollectionsFremwork.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Cherry");

        Collections.sort(list);

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
