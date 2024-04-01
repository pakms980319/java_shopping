package Ch19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class C04ReaderMain {
	public static void main(String[] args) throws IOException{
		Reader fin = new FileReader("C:\\tmp_io\\test3.txt");
//		Writer fout = new FileWriter("C:\\tmp_io\\test4.txt");
		StringBuffer buffer = new StringBuffer();
		
		
		
		long startTime = System.currentTimeMillis();
		
//		char[] tmp = new char[10];
		int data;
		
		/*
		 * 이전에 읽어들인 데이터로 인한 에러 발생할 수 있다
		 */
		
		while(true) {
			data = fin.read();
			
			if(data == -1) {
				break;
			}
//			fout.write(tmp);
//			fout.flush();
//			buffer.append();
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("걸린시간: " + (endTime - startTime) + "ms");
		
//		System.out.println(buffer);
		
		fin.close();
//		fout.close();
	}
}
