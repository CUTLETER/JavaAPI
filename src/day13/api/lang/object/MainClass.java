package day13.api.lang.object;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * Object클래스의 여러 가지 메소드 맛보기
		 * 1. equals() : 동일 객체인지 확인함
		 * 2. **** toString() : 객체 주소를 문자열로 반환함 - 오버라이딩 해서 많이 사용함
		 * 3. hashCode() : 객체의 (거의) 고유한 숫자값 반환함
		 * 4. clone() : 객체를 복사함
		 * 5. finallize() : 객체가 소멸되기 전에 실행됨 - deprecated됨 (낮은 버전에서만 제공될 거라 더이상 쓸 필요 없단 뜻)
		 */
		
		Person a = new Person("홍길동");
		Person b = new Person("홍길동");
		
// 변수명 적고 . 찍었을 때 나타나는 자동완성 메소드 읽는 법 - () 안에는 매개변수, : 뒤에는 반환 타입, - 뒤에는 해당 메소드가 위치한 클래스
		
		// Person 클래스 가서 오버라이딩 시켜볼 예정 1
		boolean result = a.equals(b);
		System.out.println("같은 객체 : "+result);
		 
		System.out.println("-----------");
		
		System.out.println(a.toString());
		
		System.out.println("-----------");
		
		System.out.println("중복이 없는 고유한 숫자값 : "+a.hashCode());
		System.out.println("중복이 없는 고유한 숫자값 : "+b.hashCode());
		
		System.out.println("-----------");
		
		try {
			Person clone = (Person)a.clone();
			System.out.println("복제인간 : "+clone.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----------");
		
		// finallize - 가비지 컬렉터가 순서를 보장하지 않기 때문에 권장하지 않음
		a = null;
		b = null;
		System.gc(); // 가비지 컬렉터 호출함
		
		
	}

}
