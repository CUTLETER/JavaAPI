package day13.api.lang.string;

import java.util.Arrays;

public class StringEx01 {
	
	public static void main(String[] args) {

		// 다양한 방식으로 생성하기
		String str = "홍길동 입니다 안녕하세요?";
		String str2 = new String("홍길동");
		String str3 = new String(new char[] {'홍','길','동'});
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
		// charAt()
		System.out.println(str.charAt(0));
		
		// substring()
		System.out.println(str.substring(5)); // 삭제
		System.out.println(str.substring(1,str.length())); // 추출
		
		//split()
		String[] arr = str.split(" "); // 공백 기준으로 문자열 자르기
		System.out.println(Arrays.toString(arr));
		
		//toCharArray()
		char[] arr2 = str.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		//indexOf(), lastIndexOf()
		str = "아 좋다 좋아";
		System.out.println(str.indexOf("아")); // 순차적으로 앞에서부터 찾기
		System.out.println(str.lastIndexOf("아")); // 뒤에서부터 찾기
		System.out.println(str.indexOf("가"));
		
		if (str.indexOf("헉") == -1) {
			System.out.println("없는 문자");
		}
		
		//length()
		System.out.println(str.length());
		
		//toUpperCase() - 영어만 적용됨
		str = "Hello World Happy Day";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//trim()
		str = "    HELLOOOOOOO    ";
		System.out.println(str.trim());
		
		//replace()
		str = " 핫 둘 셋 야 빙글빙글 돌아가는 짱구의 하루 ";
		System.out.println(str.replace(" ", ""));
		System.out.println(str.replace("빙", "동"));
		str = str.replace("글", "빙"); // 원본 문자에 반영
		System.out.println(str);
		
		//equals()
		if ("홍길동".equals("홍길동")) {
			System.out.println("같다");
		}
		
		//compareTo()
		System.out.println("홍길동".compareTo("이순신")); // 먼저 홍과 이 비교, 다르면 그 차이값 바로 출력됨, 같으면 길-순 비교
		System.out.println("홍길동".compareTo("홍길자"));
		System.out.println("홍길동".compareTo("홍길동"));
		
		//String.join()
		System.out.println(String.join("***", "김밥", "부대찌개", "돈까스", "치킨"));
		
		//String.valueOf() 
		System.out.println(String.valueOf(3)+String.valueOf(3));
		
		
		
	}

}
