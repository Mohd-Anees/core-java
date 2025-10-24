package simplyLearns.innerclassDemo;

public class OuterClass {
	class InnerClass{
		public void display() {
			System.out.println("This is inner class method---");
		}
	}
	
	void outerClassMethod() {
		System.out.println("in outer class method ");
		
		class MethodLocalClass{
			void localInnerMethod() {
				System.out.println("in the method local class:method");
			}
		}
		
		MethodLocalClass mlc=new MethodLocalClass();
		mlc.localInnerMethod();
	}

}
