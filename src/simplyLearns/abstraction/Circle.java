package simplyLearns.abstraction;

public class Circle extends GraphicObject{

	@Override
	void draw() {
		System.out.println("Circle is draw");
		
	}

	@Override
	void resize() {
		System.out.println("Circle is resizing");
		
	}

}
