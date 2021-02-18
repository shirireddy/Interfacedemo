
public class Rectangle implements Shape {
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void draw() {
		System.out.println("Drawing rectangle");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.length*this.breadth);
	}

}
