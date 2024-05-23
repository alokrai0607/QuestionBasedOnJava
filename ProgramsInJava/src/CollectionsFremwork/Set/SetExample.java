package CollectionsFremwork.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Dog");
        linkedHashSet.add("Elephant");
        linkedHashSet.add("Frog");

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");

        System.out.println("HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        System.out.println("LinkedHashSet:");
        for (String animal : linkedHashSet) {
            System.out.println(animal);
        }

        System.out.println("TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}
