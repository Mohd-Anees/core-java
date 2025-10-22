package simplyLearns.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		
		// Create HashSet
		Set<String> hashSet = new HashSet<>();
		
		// Add elements
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		System.out.println("Initial HashSet: " + hashSet);
		
		// Duplicate element (ignored)
		boolean result = hashSet.add("C");
		System.out.println("Trying to add duplicate 'C': " + result);
		System.out.println("After adding duplicate: " + hashSet);
		
		// Check size
		System.out.println("Size of HashSet: " + hashSet.size());
		
		// Check if element exists
		System.out.println("Contains 'A'? " + hashSet.contains("A"));
		System.out.println("Contains 'Z'? " + hashSet.contains("Z"));
		
		// Remove element
		hashSet.remove("C");
		System.out.println("After removing 'C': " + hashSet);
		
		// isEmpty()
		System.out.println("Is HashSet empty? " + hashSet.isEmpty());
		
		// Iterate using for-each
		System.out.print("Using for-each: ");
		for (String s : hashSet) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// Iterate using Iterator
		System.out.print("Using Iterator: ");
		Iterator<String> it = hashSet.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		// Add all elements from another set
		Set<String> anotherSet = new HashSet<>();
		anotherSet.add("X");
		anotherSet.add("Y");
		hashSet.addAll(anotherSet);
		System.out.println("After addAll(anotherSet): " + hashSet);
		
		// Remove all elements from another set
		hashSet.removeAll(anotherSet);
		System.out.println("After removeAll(anotherSet): " + hashSet);
		
		// Retain only common elements (intersection)
		hashSet.add("X");
		hashSet.add("Y");
		hashSet.add("Z");
		System.out.println("Before retainAll: " + hashSet);
		Set<String> common = new HashSet<>();
		common.add("Y");
		common.add("Z");
		hashSet.retainAll(common);
		System.out.println("After retainAll(common): " + hashSet);
		
		// Convert to array
		Object[] arr = hashSet.toArray();
		System.out.print("Converted to array: ");
		for (Object obj : arr) {
			System.out.print(obj + " ");
		}
		System.out.println();
		
		// Clear all elements
		hashSet.clear();
		System.out.println("After clear(): " + hashSet);
		System.out.println("Is empty now? " + hashSet.isEmpty());
	}
}
