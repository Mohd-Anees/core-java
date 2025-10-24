package simplyLearns.staticnestedclass;

public class OuterClass {
	static int outerStaticMember=110;
	int instanceMember=20;
	private  static int outerPrivateMemeber=30;
	
	static class StaticNestedClass{
		void display() {
			System.out.println("static member of outer class="+outerPrivateMemeber);
			//System.out.println("non static member of outer class="+instanceMember);
			System.out.println("non static private member of outer class="+outerPrivateMemeber);
		}
	}

}
