package simplyLearns.exception;

public class SimpleExceptionDemo {
	public static void main(String[] args) {
		int data=100/0;//divide by 0
		System.out.println(data);
		
		String name=null;
		System.out.println(name.charAt(0));
	}

}
