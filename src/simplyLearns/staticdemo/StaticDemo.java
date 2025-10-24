package simplyLearns.staticdemo;

public class StaticDemo {
	public static void main(String[] args) {
		Student student1 = new Student("Affan", 30, "Delhi Rajeev chowk",10);
//		System.out.println(student1.getName());
//		System.out.println(Student.college);
//		//System.out.println(student1.college); should be access in static way.
//		Student student2 = new Student("Affan", 30, "Delhi Rajeev chowk");
//		Student student3 = new Student("Affan", 30, "Delhi Rajeev chowk");
		System.out.println(Student.getIncrement());
		
	}

}
