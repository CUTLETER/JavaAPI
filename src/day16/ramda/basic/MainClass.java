package day16.ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		
/*			익명 객체 문법
 * 			Say01 say = new Say01() {
			
			@Override
			public void talking() {
				// TODO Auto-generated method stub
				
			}
		}; p.greeting(say);
		
		----------아래는 람다식 변형---------
		
		Say01 say (() -> {
		System.out.println("안녕");
		});
	
	
	
	
	
		---------익명 객체 문법-----------

*/
		
/*		p.greeting(new Say01() {
			
			@Override
			public void talking() {
				System.out.println("안녕");
				
			}
		});
		
		
		
		----------아래는 람다식 변형------------
*/
		
		// (매개변수 자리) -> {실행문}
		p.greeting(() -> {
			System.out.println("안녕");
			});
			
		
		
		
/*		익명 객체 문법
		p.greeting(new Say02() { // Say02의 구현 메소드
			
			@Override
			public String talking(String word) {
				return word+" : hello?";
			}
		});
		
		--------------아래는 람다식 변형------------
*/		
		
		p.greeting((String word)->{
			return word + " : hello?";
		});
		
		
		
		
		// 1.매개변수의 타입은 생략할 수 있음
		p.greeting((/*String*/word)->{
			return word+" : bye?";
		});
		
		// 2.매개변수가 1개라면 ()도 생략 가능
		p.greeting(word->{
			return word+" : bye?";
		});
		
		// 3.실행구문이 1줄이라면 {}도 생략 가능
//		p.greeting(word-> return word+" : bye?" );
		
		// 4. 1줄 구문으로 적었을 때 return 생략 가능
		p.greeting(word-> word+" : bye?");
		
		
//		calculating 메소드를 람다식으로 호출하기
//		기능 - int의 개수만큼 word를 문자열 합을 구해서 반환하기
		
		
		p.calculating((i, word) -> {
			String str = "";
			for (int k=1; k<=i; k++) {
				str += word;
			}
			return str;
		});
		
		
	}
}
