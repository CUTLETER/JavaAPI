package day14.api.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
	
	public static void main(String[] args) {
		
//		Deque - 양쪽 삽입 삭제가 자유로운 queue		
		
//		ArrayDeque<Integer> queue = new ArrayDeque<>(); 
		Deque<Integer> queue = new ArrayDeque<>(); // ArrayDeque는 Deque의 자식
		
		// 뒤부터 추가
		queue.offer(1);
		queue.offer(2);
		queue.offerLast(3);
		queue.offerLast(4); // 맨뒤
		
		// 앞부터 추가
		queue.offerFirst(10);
		queue.offerFirst(20);
		queue.offerFirst(30); // 맨앞
		
		System.out.println(queue.toString());
		
		// 맨뒤에서부터 삭제
		System.out.println(queue.pollLast());
		System.out.println(queue.pollLast());
		
		// 맨앞에서부터 삭제
		System.out.println(queue.pollFirst());
		System.out.println(queue.pollFirst());
		
		System.out.println(queue.toString());
		
		// 뒤에서 값 확인
		System.out.println(queue.peekLast());
		
		// 앞에서 값 확인
		System.out.println(queue.peekFirst());
		
		System.out.println(queue.toString());
		
		
	}

}
