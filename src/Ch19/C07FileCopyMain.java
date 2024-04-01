package Ch19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C07FileCopyMain {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\tmp_io\\" + args[0]);
		OutputStream out = new FileOutputStream("C:\\tmp_io\\" + args[1]);
		
		byte[] buffer = new byte[4096];
		int data;
		
		while( (data = in.read(buffer)) != -1 )  {
			
			out.write(buffer, 0, data);  
			out.flush();
		}
		
		in.close();
		out.close();
		
	}
}
