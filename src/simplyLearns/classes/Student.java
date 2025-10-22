package simplyLearns.classes;

public class Student {
	
	String name;
	int age;
	String address;
	
	public Student(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String toString() {
		return "Name="+this.name+", Age "+this.age+" , address "+this.address;
		
	}
	
	
	public static void main(String[] args) {
		
		Student anees = new Student("Anees",25,"Wadala Shanti nagar");
		System.out.println("Age of the student :"+anees.getName());
		System.out.println("Age of the student :"+anees.getAge());
		System.out.println("Address of the student :"+anees.getAddress());
		
		System.out.println(anees);
		anees.setAddress("Delhi Shaheen bagh");
		System.out.println(anees.getAddress());
		
	}

}
