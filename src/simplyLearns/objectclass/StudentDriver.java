package simplyLearns.objectclass;

public class StudentDriver {
	public static void main(String[] args) {
		
	Student student1=new Student(1,"ravi","USA");
	Student student2=new Student(2,"Affan","Navi Mumbai");
	Student student3=new Student(3,"Gufran","Mumbai dadar");
	Student student4=new Student(2,"ravi","Navi Mumbai");
	System.out.println(student2.equals(student4));
	//equals method compare memory block address not internal contents that why we are getting this result-false
}
}
