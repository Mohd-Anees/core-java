package simplyLearns.recursion;

public class RecursionDemo {
	public static void main(String[] args) {
		int x=findFact(5);
		System.out.println(x);
	}
	
	public static int findFact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*findFact(n-1);
		}
	}

}
