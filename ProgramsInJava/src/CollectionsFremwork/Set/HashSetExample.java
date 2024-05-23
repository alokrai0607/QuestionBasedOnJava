package CollectionsFremwork.Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Banana");
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Manngo");
        set.add("Manngo");
        set.remove("Apple");
        
        
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
