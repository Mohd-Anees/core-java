package simplyLearns.classes;

public class Cuboid {
	int height;
	int length;
	int width;
	public Cuboid(int height,int length,int width) {
		System.out.println("----First-constructor----");
		this.height=height;
		this.length=length;
		this.width=width;
	}
	
	public Cuboid(int height,int length) {
		System.out.println("----Second-constructor----");
		this.height=height;
		this.length=length;
		this.width=67;
	}
	
	public Cuboid(int dimention) {
		System.out.println("----Third-constructor----");
		height=dimention;
		length=dimention;
		width=dimention;
	}
	
	public Cuboid() {
		System.out.println("----Default-constructor----");
		this.height=10;
		this.length=10;
		this.width=10;
	}
	
	public int volume() {
		return height*length*width;
		
	}
	
	
	
	public static void main(String[] args) {
		Cuboid c=new Cuboid(10,10,10);
		int x=c.volume();
		System.out.println("Volume of the cuboid of 3 parameter:"+x);
		
		
		Cuboid c1=new Cuboid(10,10);
		int y=c1.volume();
		System.out.println("Volume of the cuboid of 2 parameter and constant width:"+y);
		
		
		Cuboid c2=new Cuboid(10);
		int z=c2.volume();
		System.out.println("Volume of the cuboid of 1 parameter and constant width,length:"+z);
		
		Cuboid c3=new Cuboid();
		int k=c3.volume();
		System.out.println("Volume of the cuboid of o parameter and constant width,l,h:"+y);
		
		
		
		
	}

}
