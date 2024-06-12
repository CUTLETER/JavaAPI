package day14.api.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		//set 생성
//		HashSet<String> set = new HashSet<>();		
		Set<String> set = new HashSet<>();
		
		//값 추가
		set.add("java");
		set.add("spring");
		set.add("java"); 
		set.add("python");
		set.add("oracle");
		set.add("jsp");
		
		//set 크기
		System.out.println(set.size()); 
		System.out.println(set.toString()); // 값의 중복 XXX
		
		//set은 순서가 없는 바구니 형태이기 때문에 get()이 없음
		//set.get(); XXX
		
		//set에 들어 있는 값을 전부 확인하려면 반복자 개념을 사용해서 확인해야 함
		Iterator<String> iter = set.iterator(); //set요소를 반복자 형태로 바꿈
		
		//값 확인 1
/*		System.out.println(iter.next()); // StringTokenizer처럼 전진만 함
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
*/		
		
		//값 확인 2
		while (iter.hasNext()) { // 다음이 있으면 true
			System.out.println(iter.next());
		}
		
		System.out.println("--------------------");
		
		//값 확인 3
		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println("---------------------");
		
		
		//값 삭제
		set.remove("java"); // index로 삭제하는 기능이 없고 값으로 지워야 함
		System.out.println(set.toString());
		
		//값 포함여부
		if (set.contains("jsp")) {
			System.out.println("포함");
		} else {
			System.out.println("미포함");
		}
		

		System.out.println(set.isEmpty());
		
		
		
		
		
		
		
	}
}
