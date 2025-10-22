package simplyLearns.collections;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
//		TreeMap<String,Integer> treeMap = new TreeMap<>();
//		treeMap.put("C", 2);
//		treeMap.put("A", 9);
//		treeMap.put("D", 10);
//		System.out.println(treeMap);
		
		
		
		
	
		        TreeMap<String, Integer> treeMap = new TreeMap<>();

		        // Adding elements
		        treeMap.put("C", 2);
		        treeMap.put("A", 9);
		        treeMap.put("D", 10);
		        treeMap.put("B", 5);
		        System.out.println("Initial TreeMap (sorted by key): " + treeMap);

		        // Access value by key
		        System.out.println("Value of key 'A': " + treeMap.get("A"));

		        // Remove a key
		        treeMap.remove("C");
		        System.out.println("After removing key 'C': " + treeMap);

		        // Check if key/value exists
		        System.out.println("Contains key 'B'? " + treeMap.containsKey("B"));
		        System.out.println("Contains value 10? " + treeMap.containsValue(10));

		        // Iterating entries
		        System.out.println("\nIterating key-value pairs:");
		        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
		            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		        }

		        // First and last keys
		        System.out.println("\nFirst key: " + treeMap.firstKey());
		        System.out.println("Last key: " + treeMap.lastKey());

		        // First and last entries
		        System.out.println("First entry: " + treeMap.firstEntry());
		        System.out.println("Last entry: " + treeMap.lastEntry());

		        // Submap (keys between "A" and "D")
		        System.out.println("SubMap from A to D: " + treeMap.subMap("A", "D"));

		        // HeadMap (keys less than "C")
		        System.out.println("HeadMap up to C: " + treeMap.headMap("C"));

		        // TailMap (keys greater than or equal to "B")
		        System.out.println("TailMap from B: " + treeMap.tailMap("B"));

		        // Size
		        System.out.println("Size of TreeMap: " + treeMap.size());

		        // Clear
		        treeMap.clear();
		        System.out.println("After clearing: " + treeMap);
		    }


}
