package day14.api.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		
//		LinkedList<String> list = new LinkedList<>(); 이렇게 해도 되는데 부모인 List에 담아서 씀
		List<String> list = new LinkedList<>(); // List 말고도 Queue에 담을 수도 있음
		
//		ArrayList와 사용 방법이 동일함
		
		// 값 추가
		list.add("홍길동");
		list.add("홍길자");
		list.add("홍길순");
		System.out.println(list.toString());
		
		// 값 얻기
		String n = list.get(1);
		System.out.println("1번째 요소 값 : "+n);
		
		// 값 수정
		list.set(0, "이순신으로 수정해봄");
		System.out.println(list.toString());
		
		// 값 삭제
		list.remove(0);
		System.out.println(list.toString());
		
		// 값 검색
		list.contains("홍길순");
		
		// 값 모조리 지우기
		list.clear();
		System.out.println(list.toString());
		
		
		
		
	}
}
