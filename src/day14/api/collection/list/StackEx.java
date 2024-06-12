package day14.api.collection.list;

import java.util.Stack;

public class StackEx {
	
	public static void main(String[] args) {
		
// 		MethodEx06 참조할 것

//		모든 컬렉션은 동적인 크기를 가짐 - 사용하려면 선언부터 하기		
		Stack<Integer> stack = new Stack<>();
		
//		**스택에 값을 추가함	- push
		stack.push(1);
		stack.push(2);
		stack.push(3); // 마지막에 들어감
		System.out.println(stack.toString());
		
//		**스택에 값을 삭제함 - pop
//		stack.pop(); // 값을 삭제함과 동시에 반환함
		int a = stack.pop(); // 그 반환된 삭제값을 a에 저장시킴
		
//		스택에 들어 있는 값을 문자열로 확인하기
		System.out.println(stack.toString());
		System.out.println(a);
		
//		스택의 크기
		System.out.println("스택의 크기 : "+stack.size());
		
//		**peek() - 스택에서 값을 얻는 함수 - 뒤에서부터 값만 얻어냄 (삭제XXXXX)
		int b = stack.peek(); 
		System.out.println(b); // 맨뒤인 2 값을 얻어냄 
		System.out.println(stack.toString()); // 2는 삭제된 게 아님

// 		스택이 비어 있는지 확인하기
		System.out.println(stack.isEmpty()); // 스택이 비어 있다면 true, 아니라면 false
		
		
		
		
	}

}
