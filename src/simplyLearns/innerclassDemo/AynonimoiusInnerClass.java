package simplyLearns.innerclassDemo;

public class AynonimoiusInnerClass {
	public static void main(String[] args) {
		
		Bicycle mountainBike=new MountainBike();
		mountainBike.canApplybreak();
		mountainBike.canSpeedUp();
		
		
		Bicycle bicycle = new Bicycle() {
			
			@Override
			public void canSpeedUp() {
				System.out.println("---------Can speed up mountain bike by using the ananymous class--------");
			}
			
			@Override
			public void canApplybreak() {
				System.out.println("-----------Can apply break by using the ananymous class---------");
				
			}
		};
		
		bicycle.canSpeedUp();
		bicycle.canApplybreak();
	}

}
