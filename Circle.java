package B07Lab5;


public class Circle{
	public double radius;
	public Point p;
	
	public Circle() {
		Point origin = new Point(0,0);
		this.p = origin;
		this.radius = 1;
	}
	
	public Circle(double radius, Point p) {
		this.p = p;
		this.radius = radius;
	}
	
	public double perimeter() {
		return 2 * 3.14 * this.radius;
	}
	
	public double area() {
		return 3.14 * this.radius * this.radius;
	}
	
	
}