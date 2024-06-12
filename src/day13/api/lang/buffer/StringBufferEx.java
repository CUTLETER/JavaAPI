package day13.api.lang.buffer;

import java.io.BufferedReader;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
//		빠른 문자열
//		StringBuffer, StringBuilder(얘가 좀 더 빠름)

		String str = new String("Java ");
		StringBuffer sb = new StringBuffer("Java ");
		
		System.out.println(str);
		System.out.println(sb);
		
		str = str + "BYE";
		sb.append("BYE"); // .append() 맨 마지막에 문자열 추가함
		
/*차이점*/		System.out.println(str); // String - 원본 문자에 담아주는 작업을 해야 원본이 바뀜
				System.out.println(sb); // StringBuffer - 원본 문자가 바뀜
		
		sb.insert(5, "Hello "); // .insert() 중간에 추가함 ex) 5번째 index에 문자열 추가함
		System.out.println(sb);
		
		sb.replace(5, 10, "good"); // 5 이상 10 미만 변경
		System.out.println(sb);
		
		sb.delete(5, 10); // 5 이상 10 미만 삭제
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		String s = sb.toString();
		if (s.equals("Java BYE")) { // String은 String끼리, StringBuffer는 StringBuffer끼리 비교해야 함
			System.out.println("같다");
		}
		
		
	}

}
