package simplyLearns.collections;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();

		// Add elements
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		System.out.println("Initial LinkedList: " + linkedList);

		// Add elements at first and last
		linkedList.addFirst("D");
		linkedList.addLast("Z");
		System.out.println("After addFirst() & addLast(): " + linkedList);

		// Add element at specific index
		linkedList.add(2, "E");
		System.out.println("After adding 'E' at index 2: " + linkedList);

		// Access elements
		System.out.println("First element: " + linkedList.getFirst());
		System.out.println("Last element: " + linkedList.getLast());
		System.out.println("Element at index 3: " + linkedList.get(3));

		// Check if contains
		System.out.println("Contains 'B'? " + linkedList.contains("B"));
		System.out.println("Contains 'X'? " + linkedList.contains("X"));

		// Remove by index and value
		linkedList.remove(3);
		System.out.println("After remove(3): " + linkedList);
		linkedList.remove("A");
		System.out.println("After remove(\"A\"): " + linkedList);

		// Remove first and last
		linkedList.removeFirst();
		System.out.println("After removeFirst(): " + linkedList);
		linkedList.removeLast();
		System.out.println("After removeLast(): " + linkedList);

		// Offer (adds element at end)
		linkedList.offer("X");
		System.out.println("After offer(\"X\"): " + linkedList);

		// Peek (returns head element without removing)
		System.out.println("Peek(): " + linkedList.peek());
		System.out.println("After peek(): " + linkedList);

		// Poll (returns and removes head element)
		System.out.println("Poll(): " + linkedList.poll());
		System.out.println("After poll(): " + linkedList);

		// Set (replace value at index)
		linkedList.set(1, "Y");
		System.out.println("After set(1, \"Y\"): " + linkedList);

		// Size
		System.out.println("Size of LinkedList: " + linkedList.size());

		// Iterate using for-each
		System.out.print("Using for-each loop: ");
		for (String s : linkedList) {
			System.out.print(s + " ");
		}
		System.out.println();

		// Iterate using Iterator
		System.out.print("Using Iterator: ");
		Iterator<String> it = linkedList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		// Convert to array
		Object[] arr = linkedList.toArray();
		System.out.print("Converted to Array: ");
		for (Object o : arr) {
			System.out.print(o + " ");
		}
		System.out.println();

		// Clear all elements
		linkedList.clear();
		System.out.println("After clear(): " + linkedList);
		System.out.println("Is empty? " + linkedList.isEmpty());
	}
}
