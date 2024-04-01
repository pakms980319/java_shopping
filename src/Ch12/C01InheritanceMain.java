//package Ch12;
//
//
//class Point2D{
//	int x;
//	int y;
//	
//	Point2D(){
//		System.out.println("Point2D() 생성자 호출!");
//	}
//	@Override
//	public String toString() {
//		return "Point2D [x=" + x + ", y=" + y + "]";
//	}
//	
//}
//class Point3D extends Point2D{
//	int z;
//
//	Point3D(){
//		super();	//상위클래스 Point2D() 생성자 호출!
//		System.out.println("Point3D() 생성자 호출!");
//	}
//	
//	@Override
//	public String toString() {
//		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
//	}
//}
//
//public class C01InheritanceMain {
//
//	public static void main(String[] args) {
//		Point3D ob = new Point3D();
//		ob.x=100;
//		ob.y=200;
//		ob.z=300;
//		System.out.println(ob);
//
//	}
//
//}
