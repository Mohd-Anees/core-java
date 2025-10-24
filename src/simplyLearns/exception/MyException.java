package simplyLearns.exception;

public class MyException extends Exception {
//default constructor
	MyException() {
		
	}
	//parametraized constructor
	MyException(String str){
		super(str);
	}
}
