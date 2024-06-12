package day14.generic.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		ABC abc = new ABC(); // 무엇이든 저장 가능한 상자
		
//		문자열을 정하는 상자		
		ABC<String> abc1 = new ABC<String>(); 
		abc1.setT("홍길동");
		String name = abc1.getT();
		
		ABC<Person> abc2 = new ABC<>(); // 뒤 <>에는 사실 타입 생략 가능함
		
		abc2.setT(new Person());
		Person p = abc2.getT();
		

//		<>는 객체 타입만 사용 가능함 .,
		ABC<Integer> abc3 = new ABC<>(); // wrapper 타입으로 적기
		

// 		멀티 제네릭 객체 생성
		DEF<Integer, String> def = new DEF<>();
		def.put(1, "홍길동");
		String n = def.get(1);
		
	}

}
