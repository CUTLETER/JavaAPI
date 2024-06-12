package day14.api.collection.map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(10, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길순");
		map.put(5, "신사임당");
		
		System.out.println(map.toString());
		
		//값 얻기
		System.out.println("3번 키에 해당되는 값 : "+map.get(3));
		
		// 반복문으로 다 뽑아내기
		Set<Entry<Integer, String>> entry = map.entrySet();
		for(Entry<Integer, String> entries : entry) {
			System.out.println(entries.getKey());
			System.out.println(entries.getValue());
		}
		
//		Map은 다른 언어 Python에서는 딕셔너리, JS에서는 객체라고 부름
		
		
	}

}
