package day13.api.lang.object;

public class Person implements Cloneable {
	
	private String name;
	
	public Person(String name) { // 새삼스러운 설명이지만 생성자 생성과 초기화 동시에 하는 법
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// obj가 가지고 있는 이름이 같으면 true를 반환하도록 오버라이딩 시켜봄 2
		if (obj instanceof Person) {
		Person p = (Person)obj;
			if (p.getName().equals(this.name)) { // p.getName() - string 타입으로 반환, .equals() - boolean 타입으로 반환
				return true;					// String s = p.getName(); + s.equals(this.name) 합친 코드	
			}
		}
		return false;
	}


	
//	멤버 변수의 값을 한 눈에 확인할 수 있도록 오버라이딩
//	Alt+Shift+S - generate toString
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
// clone 메소드 오버라이딩 해서 사용하기
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize(); // deprecated 됨
		System.out.println("객체 소멸됨");
	}
		
	

}
