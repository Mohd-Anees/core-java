package simplyLearns.exception;

import java.util.ArrayList;
import java.util.List;

class WriterHelper{
	public void writeList() {
	try {
		List<Integer> list=new ArrayList<>(10);
		list.add(10);
		System.out.println("Entering"+ "try statements");
		Integer a=list.get(1);
		System.out.println("Accessing the first elements: "+a);
	}
	catch(IndexOutOfBoundsException e) {
		System.out.println("Cought the exception out of bound "+e.getMessage());
	}
	finally{
		System.out.println("this will always be executed!!!");
		
	}
}
}
