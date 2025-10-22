package simplyLearns.abstraction;

public abstract class GraphicObject {
	int x,y;
	public GraphicObject() {
		System.out.println("base abstact class!!!");
	}
	
	public void move(int xnew,int ynew) {
		System.out.println("move to x "+x+" move to y "+y);
	}
	
	abstract void draw();
	abstract void resize();
	

}
