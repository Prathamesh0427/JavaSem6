import java.util.*;

public class HashMapSorting {
    public static void main(String[] args) {
        // Create a HashMap and add some key-value pairs
        HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "Apple");
        map.put(3, "Elderberry");
        map.put(8, "Cherry");
        map.put(1, "Date");
        map.put(2, "Banana");
        
        // Display the HashMap before sorting
        System.out.println("Before Sorting:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Sort the HashMap by keys
        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        // Display the HashMap after sorting
        System.out.println("\nAfter Sorting:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
