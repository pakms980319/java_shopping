package Ch12Ex;


abstract class Shape{
	 abstract void 넓이();
}
class Rectangle extends Shape{
	int width;
	int height;
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	void 넓이() {
		System.out.printf("넓이  : %d\n" , width*height);
	}
	
}
class Triangle extends Shape{
	int height;
	int bottomLine;
	public Triangle(int height, int bottomLine) {
		super();
		this.height = height;
		this.bottomLine = bottomLine;
	}
	@Override
	void 넓이() {
		System.out.printf("넓이  : %d\n" , (height*bottomLine)/2);
	}
}
class Circle extends Shape{
	int radius;
	static final double PI=3.14;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	@Override
	void 넓이() {
		System.out.printf("넓이  : %.2f\n" ,radius*radius*PI );
	}
	
}

public class C04Ex {

	public static void 전체넓이확인(Shape shape) 
	{
		
		//01
//		if(shape instanceof Rectangle) {
//			Rectangle rec = (Rectangle)shape;
//			System.out.printf("넓이  : %d\n" , rec.width*rec.height);
//		}else if(shape instanceof Triangle) {
//			Triangle tri = (Triangle)shape;
//			System.out.printf("넓이  : %d\n" , (tri.height*tri.bottomLine)/2);
//		}else if(shape instanceof Circle) {
//			Circle circle =(Circle)shape;
//			System.out.printf("넓이  : %.2f\n" ,circle.radius*circle.radius*circle.PI );
//		}	
		
		
		//02
		shape.넓이();
	}
	
	public static void main(String[] args) {
		전체넓이확인(new Rectangle(45,45));
		전체넓이확인(new Triangle(100,20));
		전체넓이확인(new Circle(5));
	}
}
