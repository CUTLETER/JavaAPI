package day14.api.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		//set 특징 + 정렬 기능
		//사용 방법은 동일함
		Set<String> set = new TreeSet<>();
		
		set.add("망아지");
		set.add("강아지");
		set.add("송아지");
		set.add("강아지");
		set.add("하마");
		System.out.println(set.toString());
		// 문자열 같은 경우 사전 등재 순으로 정렬
		// 숫자 같은 경우 오름차순 정렬
		
		for (String s : set) {
			System.out.println(s);
		}
		
		
		
		
		
	}
}
