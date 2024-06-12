package day16.ramda.basic;

public class Person {
	
	public void greeting(Say01 say/*인터페이스 타입*/) {
		say.talking(); // Person이 대신해서 인터페이스의 메소드를 호출시킴
	}
	
	public void greeting(Say02 say) { // 실행의 주체
		String result = say.talking("그의 인사법");
		System.out.println(result);
	}
	
	
	public void calculating(Say03 say) {
 		String result = say.calculating(10, "hello world ");
 		System.out.println(result);
	}

}
