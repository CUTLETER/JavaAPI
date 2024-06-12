package day14.generic.bad;

public class ABC {

//		무엇이든 저장 가능한 마법의 상자
	private Object obj;
	
	public void setObj(Object obj) { // 매개변수에 타입 적기
		this.obj=obj;
	}

	public Object getObj() { // Object타입으로 반환받기
		return obj;
	}
}
