package CollectionsFremwork.List;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");  //0
        list.add("Pineapple"); //1
        list.add("Banana"); //2
        list.add("Mango"); //3
        list.add("Cherry"); //4

        for (String fruit : list) {
            System.out.println(fruit);
        }
        
        System.out.println("after Using remove() method");
        list.remove(); //0
        list.remove(2);
        
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

