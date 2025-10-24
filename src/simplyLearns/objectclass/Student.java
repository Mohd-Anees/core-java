package simplyLearns.objectclass;

public class Student {
	private int roolNumber;
	private String name;
	private String address;
	public Student(int roolNumber, String name, String address) {
		super();
		this.roolNumber = roolNumber;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || obj.getClass()!=this.getClass())
			return false;
		Student student=(Student)obj;
		return (student.roolNumber==this.roolNumber);
		
	}
	
	public int hasCode() {
		return 1;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roolNumber=" + roolNumber + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
