package day14.generic.bad;

public class MainClass {
	
	public static void main(String[] args) {
		
//		저장을 문자열로
		ABC abc = new ABC();
		abc.setObj("홍길동");
		
		String str = (String)abc.getObj();
		
//		저장을 Person으로
		abc.setObj(new Person()); // = Person 객체를 저장한다
		Person p = (Person)abc.getObj();
		

/*		Object형은 무엇이든 저장할 수 있는데 값을 사용할 때
 * 		올바른 타입으로 형 변환을 진행해야 함
 */
		
	}

}
