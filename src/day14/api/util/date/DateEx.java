package day14.api.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		
//		날짜를 나타내는 데이트 객체
		Date date = new Date();
		System.out.println(date);
		
//		날짜 -> 문자열 형 변환		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String now = sdf.format(date);
		System.out.println(now);
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss E요일"); // a는 오전 오후, HH 는 24시간
		String now2 = sdf2.format(date);
		System.out.println(now2);
		
//		날짜 형식의 문자열 -> 날짜 타입(데이트 타입)으로 형 변환		
		String str = "2024-05-31 09:45:23";
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			Date d = sdf3.parse(str);
			System.out.println("변경된 날짜 타입 : "+d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}
