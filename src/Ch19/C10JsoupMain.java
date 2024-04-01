package Ch19;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.UUID;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C10JsoupMain {
	public static void main(String[] args) throws Exception {
		
		// URL 연결
//		Connection conn = Jsoup.connect("https://www.op.gg/champions");
		Connection conn = Jsoup.connect("https://www.musinsa.com/categories/item/001005");
		
		
		// DOM 객체 가져오기
		Document document = conn.get();
//		System.out.println(document);
		
		// Img 태그 받아오기
		Elements elements = document.getElementsByTag("img");
//		System.out.println(elements.size());
//		System.out.println(elements);
		
		// src 값 추출하기
		String img_url = null;
		
//		for (Element element : elements) {
//			System.out.println(element);
//		}
		
		for(Element e1 : elements) {
//			System.out.println(e1.getElementsByAttribute("src").attr("src"));
			
//			System.out.println(e1.getElementsByAttribute("src").attr("src").indexOf("//"));
			
			
			
			img_url = e1.getElementsByAttribute("data-original").attr("data-original");
			if (img_url == "") {
				continue;
			}
//			System.out.println(img_url);
			
			
//			if (e1.getElementsByAttribute("src").attr("src").indexOf("//") == 0) {
//				img_url = "htpps:" + img_url;
//			}
//			
////			System.out.println(img_url);
//			
			URL url = new URL(img_url);
//			
			InputStream in = url.openStream();
			BufferedInputStream bIn = new BufferedInputStream(in);
			OutputStream out = new FileOutputStream("C:\\tmp_io\\" + UUID.randomUUID().toString() + ".png");
//			
			byte[] buff = new byte[4096];
//			
			int data;
			while( (data = bIn.read(buff)) != -1 ) {
				out.write(buff, 0, data);
				out.flush();
			}
			bIn.close();
			in.close();
			out.close();
		}
	
	}
}
