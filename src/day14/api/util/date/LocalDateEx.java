package day14.api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateEx {

	public static void main(String[] args) {
		
/*
 * 		LocalDate - 년 월 일
 * 		LocalTime - 시 분 초
 * 		LocalDateTime - 년 월 일 시 분 초
 * 
 */
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		
		System.out.println("--------------------");
		
//		LocalDateTime -> String 형 변환 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // hh XXX, HH 24시간 형식으로 넣어줘야 String -> LocalDateTime 형 변환에 오류나지 않음
		String now = dtf.format(datetime);
		System.out.println(now);
		
		System.out.println("--------------------");
		
		
//		String -> LocalDateTime 형 변환 
		LocalDateTime nowDate = LocalDateTime.parse(now, dtf); // = LocalDateTime.parse(now, DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")); 문자, 문자에 대한 포맷 형식이 들어감
		System.out.println(nowDate);
		
		
		
		
		
	}
}
