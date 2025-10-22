package simplyLearns.inheritence;

public class InheritenceDemo {
	public static void main(String[] args) {
		
		MountainBike mountainBike = new MountainBike(20, 10, 5);
		System.out.println("Gear is:"+mountainBike.gear);
		System.out.println("Gear is:"+mountainBike.seatHeight);
		System.out.println("Gear is:"+mountainBike.speed);
		mountainBike.applyBreak(1);
		System.out.println("Bike speed after applying break--"+mountainBike.speed);
		
	}

}
