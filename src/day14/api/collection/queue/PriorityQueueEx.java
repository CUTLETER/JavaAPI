package day14.api.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	
	public static void main(String[] args) {
		
//		우선 순위 큐 - 자동 정렬 기능 있음
//		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.offer(5);
		queue.offer(8);
		queue.offer(10);
		queue.offer(7);
		queue.offer(1);
		System.out.println(queue.toString()); // 출력할 때는 정렬 엉망인 것처럼 보여도 사실은 제대로 정렬되어 있음
		
		
		// 삭제(꺼냄) - 출력문에서 보이는 순서랑 다름
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		// 입력 순서와 상관없이 값이 작은 것 먼저 꺼내짐, 더이상 값이 없으면 null이 뽑힘
		
		
		//queue가 비어 있는지 확인하기 - 큐가 비었으면 true, 아니면 false
		if (queue.isEmpty() == false) { 
		System.out.println("큐가 비어 있지 않음");
		}
		
		System.out.println("---------------------");
		
// 		UserVO를 담을 수 있는 Queue 만들기
//		큐가 순서를 확인할 때 compareTo 메소드를 확인함
//		객체를 우선순위 큐에 저장할 땐 compareTo에 정의된 형식에 따라서 우선순위 방법을 지정해야 함
//		comparable 인터페이스를 구현해서 compareTo 메소드를 오버라이딩하면 됨
		
		System.out.println("홍길동".compareTo("이순신")); // 양수가 나오면 홍길동이 사전적으로 뒤에 위치함
		System.out.println("홍길동".compareTo("홍필자")); // 음수가 나오면 홍길동이 사전적으로 앞에 위치함
	
		System.out.println("-------------------");
		
		Queue<UserVO> que = new PriorityQueue<>();
	
		que.offer(new UserVO("홍길동", 20));
		que.offer(new UserVO("이순신", 30));
		que.offer(new UserVO("홍필자", 40));
		que.offer(new UserVO("신사임당", 50));
		
		System.out.println(que.toString()); // 주소값 말고 입력된 값을 보고 싶으면 toString 오버라이딩 해야 함 1
		
		while(que.isEmpty()==false) { // 값이 빌 때마다 사이즈 변경되니까 보통은 조건을 이렇게 씀
			System.out.println(que.poll());
		}
		
		
		
		
		
		
	}

}
