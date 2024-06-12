package day16.regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex02 {

	public static void main(String[] args) {
		
		String info = "30세|서울시 관악구|02-123-1234|010-1234-1234|aaa@naver.com";
		
		/*
		 * \\d - 숫자를 찾음
		 * \\d+ - 1개 이상
		 * \\d* - 0개 이상
		 * \\d? - 0 또는 1개
		 * \\d{3} - 숫자 3개
		 * \\d{3, } - 숫자 3개 이상
		 * 
		 * \\w - 영문자 or 숫자
		 * 
		 * [a-z] - 소문자
		 * [0-9a-z] - 숫자, 소문자
		 * [a-zA-Z] - 모든 영문자 
		 * [a-zA-Z가-힣] - 영문자, 한글
		 * [a-zA-Z가-힣]+ - 영문자, 한글 1개 이상
		 * 
		 * 
		 *  + . * ? 등은 정규 표현식이라서 특수문자 그대로 쓰고 싶으면 \\? \\+ \\. \\* 이렇게 쓰기, @ 제외
		 */
		
		//전화번호 형식
		String phone = "\\d{2,3}-\\d{3,4}-\\d{4}";
		//이메일 형식
		String email = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]+";
		
		Pattern p1 = Pattern.compile(phone);
		Matcher m1 = p1.matcher(info);

		
		//find() - 정규표현식을 찾음, 여러 번 찾을 거면 반복문 돌리기
		while (m1.find()) {// 찾으면 true 아니면 false
			System.out.println("일치하는 정규 표현 : "+m1.group()); // 일치하는 정규 표현식 찾음
			System.out.println("시작 위치 : "+m1.start()); // 시작 위치
			System.out.println("끝 위치 : " +m1.end()); // 끝 위치
		}
			
		System.out.println("---------------------");
		
		Matcher m2 = Pattern.compile(email).matcher(info);
		while (m2.find()) {
			System.out.println("이메일 문자 : "+m2.group());
		}
		
	}
}
