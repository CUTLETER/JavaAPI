package day14.api.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
//		문법은 전체적으로 비슷함		
//		ArrayList<String> list = new ArrayList<>(); 
		List<String> list = new ArrayList<>(); // 위랑 결과는 똑같음, import 필수
		
// 		list에 값을 추가함
		list.add("java");
		list.add("JSP");
		list.add("git");
		list.add("database");
		list.add("java"); // 배열처럼 중복 값 허용됨
		list.add("python");
		
//		리스트의 크기
		System.out.println("크기 : "+list.size());
		
//		리스트를 문자열로
		System.out.println(list.toString());

// 		리스트 중간에 값 넣기
		list.add(2, "홍길동");
		System.out.println(list.toString());
		
//		리스트 값 수정하기
		list.set(1, "수정된 값");
		System.out.println(list.toString());
		
//		리스트 값 얻기
		String str = list.get(4);
		System.out.println("4번째 값 : "+str);
		
//		리스트에서 값 삭제하기
		String str2= list.remove(3); 
		System.out.println(str2);
		list.remove("python"); // 값을 삭제 시키고 삭제한 값을 반환함, 값을 받기 싫으면 값을 따로 저장하지 않으면 됨
		
		System.out.println(list.toString());
		
		System.out.println("--------------");
		
// 		여기서부턴 참고만 할 것
//		배열로 리스트 빨리 만들기
//		List<String> newList = Arrays.asList("a","b","c","d","e"); 또는
		
		String[] arr = {"a","b","c","d","e"};
		List<String> newList = Arrays.asList(arr); // 이렇게도 만들 수 있음
		
		System.out.println(newList.toString());
		
// 		리스트의 병합
		list.addAll(newList); // - 매개변수가 컬렉션 계열의 제네릭이 String 타입이어야
		System.out.println(list.toString());
		
//		리스트에 값의 포함 여부 확인
		if (list.contains("c")) {
			System.out.println("c는 포함되어 있지 않습니다");
		}
		
		
		
		
		
		
		
	}

}
