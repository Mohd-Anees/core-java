package simplyLearns.comparable;


public class Student implements Comparable<Student>{
	private int roolNumber;
	private String name;
	private int age;
	public Student(int roolNumber, String name, int age) {
		super();
		this.roolNumber = roolNumber;
		this.name = name;
		this.age = age;
	}
	
	
	public int getRoolNumber() {
		return roolNumber;
	}
	public void setRoolNumber(int roolNumber) {
		this.roolNumber = roolNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAddress(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roolNumber=" + roolNumber + ", name=" + name + ", address=" + age + "]";
	}


	@Override
	public int compareTo(Student student) {
		return this.roolNumber-student.roolNumber;
	}
	
	
	

}
