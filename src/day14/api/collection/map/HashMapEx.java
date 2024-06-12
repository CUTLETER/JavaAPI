package day14.api.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		// HashMap 객체 생성
//		HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		
		// 값 추가
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길동");
		map.put(4, "홍길자");
		map.put(5, "신사임당");
		
		System.out.println(map.size());
		System.out.println(map.toString()); // {1=홍길동, 2=이순신, 3=홍길동, 4=홍길자, 5=심사임당} - '1=홍길동' 이 형태를 entry라고 부름
		
		// 맵에 같은 key 넣으면?
		map.put(5, "숙녀임당");
		System.out.println(map.toString()); // key는 고유하기 때문에 중복된 key를 넣으면 추가하지 않고 그에 해당되는 value를 수정함
		
		// 값 얻기
		String value =map.get(3); // key를 매개변수로 넣으면 value 바로 반환함
		System.out.println("3번 key의 value 값: "+value);
		
		// 키 포함여부
		if (map.containsKey(3)) { // 3번 키가 있다면 true
			System.out.println("3번 키가 존재함");
		}
		
		// 값 포함여부
		if (map.containsValue("이순신")) {
			System.out.println("이순신 값이 존재함"); // 어디 들어있는지는 알려주지 않고 여부만
		}
		
		// 값 삭제
		map.remove(3); // 3번 키 삭제
		System.out.println(map.toString());
	
		System.out.println("----------------------");
		
		// **맵의 반복 - '맵엔 순서가 없어서' entrySet을 이용해서 set으로 변경한 다음에 회전시킴
		Set<Entry<Integer, String>> set = map.entrySet(); // Set에다가 Entry 타입을 넣어줌
		
		for (Entry<Integer, String> entry : set) { // entry 안에는 키, 값을 얻을 수 있는 메소드가 있음
			System.out.println("키 : "+entry.getKey()+", 값 : "+entry.getValue());
			
		}
		
		
		
		
		
	}

}
