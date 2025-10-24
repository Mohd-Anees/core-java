package simplyLearns.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
	public static void main(String[] args) throws MyException {
		
//		FileReader file=new FileReader("c:\\test\\a.txt");
//		BufferedReader fileInput = new BufferedReader(file);
//		
//		//print first 3 lines of the file "C:\test\a.txt"
//		for(int counter=0;counter<3;counter++) {
//			System.out.println(fileInput.readLine());
//		}
//		
//		fileInput.close();
//		//throw new MyException()
		throw new MyException();
	}

}
