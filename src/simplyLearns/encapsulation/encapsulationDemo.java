package simplyLearns.encapsulation;

public class encapsulationDemo {
	public static void main(String[] args) {
		Student s=new Student("Anees",20,"Aligarh durra mafi");
		System.out.println(s);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());
	}

}
