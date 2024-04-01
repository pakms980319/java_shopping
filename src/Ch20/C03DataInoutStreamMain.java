package Ch20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class C03DataInoutStreamMain {
	public static void main(String[] args) throws Exception {
//		FileOutputStream out = new FileOutputStream("C:\\tmp_io\\test3.txt");
//		DataOutputStream dout = new DataOutputStream(out);
//		dout.writeUTF("홍길동");
//		dout.writeDouble(95.5);
//		dout.writeInt(100);
//		dout.flush();
//		dout.close();
		
		FileInputStream in = new FileInputStream("C:\\tmp_io\\test3.txt");
		DataInputStream din = new DataInputStream(in);
		
		String name = din.readUTF();
		double num = din.readDouble();
		int num2 = din.readInt();
		
		System.out.println(name);
		System.out.println(num);
		System.out.println(num2);
		
		din.close();
		
	}
}
