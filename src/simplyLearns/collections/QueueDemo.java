package simplyLearns.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("America");
		queue.add("Pak");
		queue.add("Germani");
		queue.add("UAE");
		queue.add("Spain");
		
		System.out.println("Original queue:"+queue);
		queue.remove();
		System.out.println("Queue after removing the head:-"+queue);
		
		String head = queue.peek();
		System.out.println("Head elements: "+head);
		System.out.println(queue);
		
		String removeHeadElement = queue.poll();
		System.out.println("Head Elements:"+removeHeadElement);
		System.out.println(queue);
		
		
		
		
	}

}
