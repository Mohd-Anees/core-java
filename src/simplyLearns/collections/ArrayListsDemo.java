package simplyLearns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListsDemo {
	public static void main(String[] args) {
		
		// Create ArrayList
		List<Integer> arrayList = new ArrayList<Integer>(5);

		// Add elements
		for (int i = 1; i <= 5; i++) {
			arrayList.add(i);
		}
		System.out.println("Initial ArrayList: " + arrayList);

		// Add element at specific index
		arrayList.add(2, 99);
		System.out.println("After adding 99 at index 2: " + arrayList);

		// Remove element by index
		arrayList.remove(3);
		System.out.println("After removing element at index 3: " + arrayList);

		// Remove element by value (Integer.valueOf to avoid confusion with index)
		arrayList.remove(Integer.valueOf(99));
		System.out.println("After removing value 99: " + arrayList);

		// Get element by index
		System.out.println("Element at index 2: " + arrayList.get(2));

		// Change (set) element at index
		arrayList.set(1, 50);
		System.out.println("After setting index 1 to 50: " + arrayList);

		// Check if an element exists
		System.out.println("Contains 50? " + arrayList.contains(50));
		System.out.println("Contains 99? " + arrayList.contains(99));

		// Get size
		System.out.println("Size of ArrayList: " + arrayList.size());

		// Sort elements
		Collections.sort(arrayList);
		System.out.println("After sorting: " + arrayList);

		// Reverse order
		Collections.reverse(arrayList);
		System.out.println("After reversing: " + arrayList);

		// Iterate using normal for loop
		System.out.print("Using for loop: ");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println();

		// Iterate using enhanced for loop
		System.out.print("Using enhanced for loop: ");
		for (int num : arrayList) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Iterate using Iterator
		System.out.print("Using Iterator: ");
		Iterator<Integer> it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		// Index of element
		System.out.println("Index of 50: " + arrayList.indexOf(50));

		// Is ArrayList empty?
		System.out.println("Is empty? " + arrayList.isEmpty());

		// Convert to Array
		Object[] arr = arrayList.toArray();
		System.out.print("Converted to array: ");
		for (Object obj : arr) {
			System.out.print(obj + " ");
		}
		System.out.println();

		// Clear the list
		arrayList.clear();
		System.out.println("After clearing: " + arrayList);
		System.out.println("Is empty now? " + arrayList.isEmpty());
	}
}
