package simplyLearns.methodOverrlooding;

public class MethodOverloodingDemo {
	
	public int multiply(int x,int y,int z) {
		return x*y*z;
		
	}
	
	public int multiply(int x,int y) {
		return x*y;
		
	}
	
	public double multiply(double x,double y) {
		return x*y;
		
	}
	
	
	public static void main(String[] args) {
		MethodOverloodingDemo demo=new MethodOverloodingDemo();
		System.out.println(demo.multiply(12, 12, 12));
		System.out.println(demo.multiply(12, 12));
		System.out.println(demo.multiply(12.5, 12.0));
	}

}
