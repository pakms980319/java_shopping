package Ch02;

public class C08ETC {

	public static void main(String[] args) {
		
//		byte a = 'a';
//		char b = '가';
		short c = (short)'가';
		char d = '가';
		
		System.out.printf("%d\n,",(int)c);
		System.out.printf("%d\n,",(int)d);
		System.out.printf("%x\n",(int)'가');
		System.out.printf("%d\n",(int)'가');
		
		int num = 0b0011000100110001;
		System.out.printf("%c", (char)num);
		System.out.printf("%c", (char)12593);
		
		
		
	}
}
