package simplyLearns.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
//		hashMap.put("a", 10);
//		hashMap.put("b", 20);
//		hashMap.put("c", 30);
//		hashMap.put("d", 60);
//		
//		System.out.println(hashMap);	
//		System.out.println("Size of the hashMap:-"+hashMap.size());
//		
//		if(hashMap.containsKey("a")) {
//			Integer i = hashMap.get("a");
//			System.out.println("Value of the key a is="+i);
//		}
//		
//		System.out.println("=============================");
//		for (String key : hashMap.keySet()) {
//			System.out.println("The key "+key+" and value is:"+hashMap.get(key));
//		}
//		
//		System.out.println("==================");
//		for(Entry<String,Integer> entry:hashMap.entrySet()) {
//			System.out.println("Key "+entry.getKey()+" ,value: "+entry.getValue());
//		}
		

        // Adding key-value pairs
        hashMap.put("a", 10);
        hashMap.put("b", 20);
        hashMap.put("c", 30);
        hashMap.put("d", 60);

        System.out.println("Initial HashMap: " + hashMap);
        System.out.println("Size of the HashMap: " + hashMap.size());

        // Get a value using key
        if (hashMap.containsKey("a")) {
            Integer i = hashMap.get("a");
            System.out.println("Value of key 'a' = " + i);
        }

        // Replace value
        hashMap.replace("b", 25);
        System.out.println("After replacing value of key 'b': " + hashMap);

        // PutIfAbsent
        hashMap.putIfAbsent("e", 100);
        hashMap.putIfAbsent("a", 200); // won't change 'a' because it's already present
        System.out.println("After putIfAbsent: " + hashMap);

        // Remove by key and by key-value pair
        hashMap.remove("c");
        System.out.println("After removing key 'c': " + hashMap);

        hashMap.remove("d", 60);
        System.out.println("After removing key 'd' with value 60: " + hashMap);

        // Contains methods
        System.out.println("Contains key 'a'? " + hashMap.containsKey("a"));
        System.out.println("Contains value 25? " + hashMap.containsValue(25));

        // Iterating keys
        System.out.println("\nIterating keys:");
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key);
        }

        // Iterating values
        System.out.println("\nIterating values:");
        for (Integer value : hashMap.values()) {
            System.out.println("Value: " + value);
        }

        // Iterating both key and value
        System.out.println("\nIterating key-value pairs:");
        for (Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        // Clear all entries
        hashMap.clear();
        System.out.println("\nAfter clearing: " + hashMap);
		
	}

}
