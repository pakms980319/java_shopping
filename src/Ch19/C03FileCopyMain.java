package Ch19;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class C03FileCopyMain {
	
	private static String FileDir = "C:\\tmp_io";
	
	public static void main(String[] args) throws IOException {

		for (String arg : args) {
			System.out.println(arg);
		}
		
		Reader in = new FileReader(FileDir + File.separator +  args[0]);
		Writer out = new FileWriter(FileDir + File.separator + args[1]);
		
		while(true) {
			int data = in.read();
			
			if(data == -1) {
				break;
			}
			
			out.write((char)data);
			out.flush();
		}
		in.close();
		out.close();
		
	}
}
