package Ch17;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class C06PropertiesMain {
	public static void main(String[] args) throws IOException {
		
		
		
		// 파일의 절대경로를 직접 작성하지 않고 사용하는 법
		// 운영체제에 관계 없이 사용하기 위한 방법
		
		String classPath = System.getProperty("java.class.path");				// class 파일 위치
//		System.out.println("ClassPath : " + classPath);
		
		String dirPath = System.getProperty("user.dir");						// 현재 프로젝트 위치
//		System.out.println("DirPath : " + dirPath);
		
		String packagePath = C06PropertiesMain.class.getPackageName();			// 패키지 위치
//		System.out.println("PackagePath : " + packagePath);
		
		// File.separator 운영체제에 따른 구분자 사용
		
		String filePath = dirPath + File.separator + "src" + File.separator + packagePath + File.separator + "application.properties";
		System.out.println(filePath);
		
		
		Properties properties = new Properties();
		
		FileInputStream fin = new FileInputStream(filePath);
		properties.load(fin);

		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("url: " + url);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		
	}
}
