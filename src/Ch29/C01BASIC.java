package Ch29;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TEST {
	String name;
	String addr;
	int age;
	public TEST() {}
	public TEST(String name) {this.name = name;}
	public TEST(int name) {this.age = age;}
	
	public TEST(String name, String addr) {this.name=name;this.addr=addr;}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		System.out.println("getAge Called " + this.age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "TEST [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
}

public class C01BASIC {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchFieldException {
		Class<?> clazz = Class.forName(String.valueOf(TEST.class).split(" ")[1]);
		
		
		Method method = clazz.getDeclaredMethod("getAge", null);
		
		System.out.println("Method: " + method);
		
		Object result = method.invoke(new TEST(20), null);
		
		Constructor<?> constructor = clazz.getConstructor(String.class);
		System.out.println(constructor);
		
		Object obj = constructor.newInstance("홍길동");
		
		System.out.println(obj);
		
//		TEST tst = (TEST) obj;
//		
//		System.out.println(tst.getName());
		
		Field field = clazz.getDeclaredField("addr");
		
		System.out.println(field);
		field.set(obj, "대구");
		
		System.out.println(obj);
		
	}
}
