package CollectionsFremwork.Set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");

        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
