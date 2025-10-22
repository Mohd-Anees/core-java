package simplyLearns.interfaces;

public class ElectricCar implements Vehicle,Car {

	@Override
	public void drive() {
		System.out.println("Drive the vehicle");
		
	}
	@Override
	public void breaks() {
		System.out.println("Break maro bro");
		
	}
	

}
