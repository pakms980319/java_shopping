package Ch20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class C02ReadLineMain {
	public static void main(String[] args) throws Exception {
//		Writer out = new FileWriter("C:\\tmp_io\\test2.txt");
		
		
//		이렇게 하면 개행이 되지 않는다
//		out.write("HELLO");
//		out.write("HELLO");
//		out.write("HELLO");
//		out.flush();
//		out.close();
		
//		BufferedWriter bout = new BufferedWriter(out);
//		PrintWriter pout = new PrintWriter(bout);
//		pout.println("HELLO");
//		pout.println("HELLO");
//		pout.println("HELLO");
//		pout.flush();
//		pout.close();
		
		
		Reader in = new FileReader("C:\\tmp_io\\test2.txt");
		BufferedReader bin = new BufferedReader(in);
		
		String tmp;
		while( (tmp = bin.readLine()) != null ) System.out.println(tmp);
	}
}
