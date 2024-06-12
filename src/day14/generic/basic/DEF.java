package day14.generic.basic;

public class DEF<T, C> { // 멀티 제네릭

	//  t=키, c=값
	
	private T key;
	private C value;
	
	public void put(T key, C value) {
		this.key=key;
		this.value=value;
	}
	
	public C get(T key) {  // key를 갖다주면 C타입으로 반환하겠다
		return value;
	}
	
}
