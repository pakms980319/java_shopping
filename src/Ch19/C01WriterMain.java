package Ch19;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriterMain {
	public static void main(String[] args) throws IOException {
		
//		Reader fin = new FileReader("C:\\tmp_io");
		
//		Writer fout = new FileWriter("C:\\tmp_io\\test1.txt");  // 실행할때마다 덮어쓴다
		Writer fout = new FileWriter("C:\\tmp_io\\test1.txt", true);  // append, 이어쓴다
		String lines = 
				"TEST4" + "\n" +
				"TEST5" 	+ "\n" +
				"TEST6\n";
		
		fout.write(lines);
		
		fout.flush();  // 출력 버퍼 공간 초기화
		fout.close();	
	}
}
