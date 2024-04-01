//package Ch16;
//
//class Tiger{
//	String name;
//	public Tiger(String name) {
//		super();
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Tiger [name=" + name + "]";
//	}
//}
//class Panda{
//	String name;
//	public Panda(String name) {
//		super();
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Panda [name=" + name + "]";
//	}
//}
//
//
//
//public class C03GenericMain {
//
//	public static <T> void PrintInfo(T[] array)
//	{
//		for(T el :array) {
//			System.out.println(el.toString());
//		}	 
//	}
//	public static  void PrintInfo2(Object[] array)
//	{
//		for(Object el : array)
//		{
//			if(el instanceof Tiger) {
//				Tiger down = (Tiger)el;
//				System.out.println(down);
//			}else if(el instanceof Panda) {
//				Panda down = (Panda)el;
//				System.out.println(down);
//			}
//		}
//	}
//	public static void main(String[] args) {
//		Tiger[] arr1={new Tiger("호랑이"),new Tiger("호랭이"),new Tiger("호키")};
//		PrintInfo(arr1);
//		System.out.println();
//		Panda[] arr2 = {new Panda("렛서팬더"),new Panda("대장균종팬더")};
//		PrintInfo(arr2);
//		System.out.println();
//		Object[] arr3 = {new Panda("중국팬더"),new Tiger("시베리안호랑이"),new Panda("레서팬더")};
//		PrintInfo2(arr3);
//		
//		
//	}
//
//}