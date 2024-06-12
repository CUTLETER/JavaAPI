package day14.api.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
//		자바에서 기본 큐는 LinkedList로 대신해서 사용함
		Queue<String> queue = new LinkedList<>(); // Queue 말고도 List에 담을 수 있음
		
		// **큐의 삽입 - offer
		queue.add("홍길동"); // 뒤에서 값 추가
		
		queue.offer("이순신"); // 뒤에서 값 추가
		queue.offer("홍길자");
		System.out.println(queue.toString());
		
		// **큐의 삭제 - poll
		String n = queue.poll(); // List는 index 이용해서 삭제할 수 있지만 Queue는 XXXX 앞에서부터 차례차례 제거함
		System.out.println(n);
		System.out.println(queue.poll());
		System.out.println(queue.toString());
		
		// **큐의 값 확인 - peek
		String n2 = queue.peek();
		System.out.println(n2); // 값을 확인만 하고 삭제하지는 않음
		System.out.println(queue.toString());
		
//		Stack 짝궁 - push, pop, peek Queue 짝궁 - offer, poll, peek		
		
		
		
		System.out.println("---------------------");
		
		
		
//		LinkedList를 LinkedList 타입에 저장하면 list 기능과 queue기능을 둘 다 쓸 수 있음
		LinkedList<String> list = new LinkedList<>();
		
		list.add("a"); // list
		list.offer("b"); // queue
		list.offer("c"); // queue
		list.offer("d"); // queue
		
		list.addFirst("앞에서 추가함");
		list.addLast("뒤에서 추가함");
		
		System.out.println(list.toString());
		
		System.out.println("------------------");
		
		System.out.println(list.poll()); // queue - 앞에서부터 삭제
		System.out.println(list.toString());
		System.out.println(list.remove(4)); // list - 인덱스를 이용하여 삭제
		System.out.println(list.toString());
		
		System.out.println("-------------------");
		
		System.out.println(list.peek()); // queue - 앞에서 얻기
		System.out.println(list.get(2)); // list - 인덱스를 이용하여 얻기
		System.out.println(list.toString());
		
		
	}
}
