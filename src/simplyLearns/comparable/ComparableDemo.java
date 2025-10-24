package simplyLearns.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		Student anees=new Student(3,"Anees", 21);
		Student affan=new Student(2,"Affan", 30);
		Student ashfaq=new Student(1,"Ashfaq", 43);
		Student ramesh=new Student(4,"Ramesh", 22);
		list.add(anees);
		list.add(affan);
		list.add(ashfaq);
		list.add(ramesh);
		
	   Collections.sort(list);
	   
	   System.out.println("Students after natural sorting: ");
	   list.forEach(student->System.out.println(student.getName()));
	   
		Collections.sort(list,new AgeComparator());
		System.out.println("Student after custom sorting on the age basis sorting:");
		list.forEach(student->System.out.println(student.getName()));
		
	}

}
