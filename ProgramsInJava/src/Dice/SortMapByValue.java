package Dice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("A", 5);
        dataMap.put("B", 3);
        dataMap.put("C", 8);
        dataMap.put("D", 2);
        dataMap.put("E", 6);

        // Convert map  to  list
        
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(dataMap.entrySet());

         // Sort the list in ascending order
        
        List<Map.Entry<String, Integer>> sortedList = entryList.stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        // Print here
        System.out.println("Sorted Map Entries by Value:");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
