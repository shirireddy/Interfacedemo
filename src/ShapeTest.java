
public class ShapeTest {

	public static void main(String[] args) {
		Shape shape=new Circle(10);
		System.out.println("breakpoint");
		shape.draw();
		System.out.println("Area of circle is: "+shape.getArea());
		System.out.println("radius: "+((Circle) shape).getRadius());
		
		shape=new Rectangle(10,20);
		System.out.println("breakpoint");
		shape.draw();
		System.out.println("Area of rectangle is: "+shape.getArea());
	}

}
