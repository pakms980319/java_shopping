package Ch14;

import java.util.Calendar;
import java.util.Date;

public class C05DateMain {

	public static void main(String[] args) {
		
//		Date d1 = new Date();
//		System.out.println(d1);
//		System.out.println(d1.getYear());
//		System.out.println(d1.getMonth()+1);
//		System.out.println(d1.getDay());//0-6(일-토)
//		System.out.println(d1.getHours());
//		System.out.println(d1.getMinutes());
//		System.out.println(d1.getSeconds());
//		System.out.println(d1.getTime());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); 	//요일
															// 1-7(일-토)
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
	}
}
