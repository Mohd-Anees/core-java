package simplyLearns.collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Anees");
		stack.push("Affan");
		stack.push("Arshad");
		stack.push("Gufran");
		
		System.out.println("Stack====>"+stack);
		System.out.println("It follow lifo data structure ");
		String popElement = stack.pop();
		System.out.println("Removed elements "+popElement);
		System.out.println("Stack====>"+stack);
		
		
		String popElement1 = stack.pop();
		System.out.println("Removed elements "+popElement1);
		System.out.println("Stack====>"+stack);
		
		
		String topElemenet = stack.peek();
		System.out.println(topElemenet);
		System.out.println(stack);
	}

}
