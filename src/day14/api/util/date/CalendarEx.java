package day14.api.util.date;

import java.util.Calendar;

public class CalendarEx {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); // 이 안에 날짜와 시간 등 메뉴얼이 들어 있음
		
		int year = cal.get(Calendar.YEAR);
		int year2 = cal.get(1); // 이렇게 써도 똑같지만 일일이 해당 메뉴얼 번호를 외울 순 없어서 위에처럼 Calendar.YEAR로 씀
		
		int month = cal.get(Calendar.MONTH)+1; // 얘는 시작값 잘못돼서 무조건 +1 해야 함
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
		System.out.println(year2);
		
		
	}

}
