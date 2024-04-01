package Ch19;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class C09URLStreamMain {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://n.news.naver.com/mnews/article/056/0011684202");
		InputStream bin = url.openStream();		// InputStream 기본 스트림 > 후에 보조 스트림을 사용하여 옵션을 붙인다
		
		BufferedInputStream buffIn = new BufferedInputStream(bin);  // 보조 스트림
																	// 버퍼 공간 추가
		
		Reader in = new InputStreamReader(buffIn);					// 보조스트림
																	// byte  단위 - > char 단위로 변화해서 받음
		
		Writer out = new FileWriter("C:\\tmp_io\\index.html");
		
		int data;
		while( (data = in.read()) != -1 ) { 
			out.write((char)data);
		}
		
		
	}
}
