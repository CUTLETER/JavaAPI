package day14.generic.basic;

public class ABC<T> { // 제네릭은 인터페이스, 클래스 옆 <타입> 쓰는 문법 - 보통은 대문자를 씀

	private T t; // 타입 미정 상태 -> 생성할 때 지정함 ex) ABC<String> abc = new ABC<String>(); 
	
	public void setT(T t) {
		this.t=t;
	}
	
	public T getT() {
		return t;
	}
	
}
