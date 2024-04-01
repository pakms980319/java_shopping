package Ch19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02ReaderMain {
	public static void main(String[] args) throws IOException{
		Reader fin = new FileReader("C:\\tmp_io\\test1.txt");
		StringBuffer buffer = new StringBuffer();
		
		while(true) {
			int data = fin.read();
			
			if(data == -1) {
				break;
			}
			
			buffer.append((char)data);
		}
		
		System.out.println(buffer);
		
		fin.close();
	}
}
