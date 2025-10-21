package simplyLearns.controlstatements;

public class NestedIFStatements {
	public static void main(String[] args) {
		int num=78;
		if(num==78) {
			System.out.println("block-1");
			if(num<100) {
				System.out.println("block-2");
				if(num<80) {
					System.out.println("block-3");
					if(num>200) {
						System.out.println("block-4");
					}
				}
			}
			
		}
	}

}
