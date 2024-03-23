package SelfLearning;

interface Drawable {
	
	final static double pi = 3.14;
	void draw(); //* By default the members of interfaces are public
}

abstract class Shape2D implements Drawable {
	
	abstract void getArea(double... dimensions);
}

class Rectangle extends Shape2D {
	
	public void draw() {
		System.out.println("Drawing a rectange...");
	}
	
	void getArea(double... sides) {
		double area = 1;
		for (double s : sides)
			area *= s;
		System.out.println("Area of the rectange is: "+area+" unit-sq.");
	}
}

class Circle extends Shape2D {
	
	public void draw() {
		System.out.println("Drawing a Circle...");
	}
	
	void getArea(double... radius) {
		double area = pi;
		for (double r : radius)
			area *= r*r;
		System.out.println("Area of the circle is: "+area+" unit-sq.");
	}
}

public class Abstract_Interface_Problem01 {
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		r.draw();
		r.getArea(7,8);
		
		c.draw();
		c.getArea(7);
		
	}

}


















