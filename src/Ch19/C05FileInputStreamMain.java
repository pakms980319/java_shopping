package Ch19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C05FileInputStreamMain {
	public static void main(String[] args) throws IOException {
		InputStream fin = new FileInputStream("C:\\tmp_io\\data.xlsx");
//		StringBuffer buffer = new StringBuffer();
		
		// 1 byte 받기
		
//		int data;
//		while(true) {
//			data = fin.read();
//			if( data == -1 ) break;
//			System.out.println((char)data);
//		}
		
		byte[] buffer = new byte[4096];
		
		while(true) {
			int data = fin.read(buffer);
			if(data == -1) break;
			
			for (int i = 0; i < data; i++) {
				System.out.print((char)buffer[i]);
			}
		}
		
	}
}
