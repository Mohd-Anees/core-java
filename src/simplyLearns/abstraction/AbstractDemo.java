package simplyLearns.abstraction;

public class AbstractDemo {
	public static void main(String[] args) {
		
		GraphicObject graphicObject=new Circle();
		graphicObject.draw();
		graphicObject.resize();
		System.out.println("=======================");
		GraphicObject graphicObject2=new Rectangle();
		graphicObject2.draw();
		graphicObject2.resize();
	}

}
