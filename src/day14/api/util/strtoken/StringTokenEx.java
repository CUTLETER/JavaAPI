package day14.api.util.strtoken;

import java.util.StringTokenizer;

public class StringTokenEx {
	
	public static void main(String[] args) {
		
//		StringTokenizer 클래스 - 문자를 특정 구분자로 기준 삼아 잘라서 사용함, split()과 비슷함		
		
		String str1 = " 오늘은 5월 31일이고 금요일 입니다 ";
		
		StringTokenizer st = new StringTokenizer(str1); // 아무 조건 없는 기본 상태에선 공백을 기준으로 잘라버림
		System.out.println("토막난 문자의 개수 : "+ st.countTokens());
	
//		한 칸씩 전진해서 보여줌, 전진밖에 못함, 전진하면 지나온 것은 소멸됨		
		String st1 = st.nextToken();
		System.out.println(st1);
		String st2 = st.nextToken();
		System.out.println(st2);
		String st3 = st.nextToken();
		System.out.println(st3);
		System.out.println(st.nextToken());
		System.out.println(st.nextToken()); // 끝
//		더 가면 출력할 값이 없어서 오류 남, 그래서 아래처럼 반복문과 함께 써야 함
		
		while(st.hasMoreTokens()) { // 다음이 있으면 true, 없으면 false
			System.out.println(st.nextToken());
		}
		
		System.out.println("--------------------");
		
		
		String log = "2024.05.31, 금요일, 홍길동, /no=30, id=abc123";
		StringTokenizer st4 = new StringTokenizer(log, ","); // log를  ,기준으로 자르기
		while (st4.hasMoreTokens()) {
			System.out.println(st4.nextToken());
		}
		
		System.out.println("-----------------------");
		
		StringTokenizer st5 = new StringTokenizer(log, ",./="); // 여러 구분자를 기준으로 자르기
		while(st5.hasMoreTokens()) {
//			System.out.println(st5.nextToken());
			System.out.println(st5.nextToken().replace(" ", ""));
		}
		
		System.out.println("------------------------");
		
		StringTokenizer st6 = new StringTokenizer(log, ",", true); // , 기준으로 자르고 구분자인 ,도 포함시킴
		while(st6.hasMoreTokens()) {
			System.out.println(st6.nextToken()); 
		}
		
		
		
		
		
	}

}
