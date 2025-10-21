package simplyLearns.operators;

public class LogicalOperator {
	public static void main(String[] args) {
		int number1=12;
		int number2=20;
		if((number1>9) &&(number2<23)) {
			System.out.println(" ==1==number1 is 12 and number2 is 20");
		}
		
		if((number1==12) ||(number2<12)) {
			System.out.println("==2==number1 is 12 and number2 is 20");
		}
		
		if((number1>9)!=(number2<12)) {
			System.out.println("==3==number1 is 12 and number2 is 20");
		}
		
	}

}
