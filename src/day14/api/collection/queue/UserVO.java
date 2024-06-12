package day14.api.collection.queue;

public class UserVO implements Comparable<UserVO> { // <>안에  비교할 대상 타입 넣기
	
	private String name;
	private int age;
	
	public UserVO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public UserVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public int compareTo(UserVO o) {
		// 내꺼랑 매개변수 꺼랑 비교해서 정렬함
		
		// 예를 들어 이름으로 대소비교
		//return this.name.compareTo(o.getName()); 이름으로 오름차순
		//return o.getName().compareTo(this.name); // 이름으로 내림차순
		
//		return Integer.compare(this.age, o.getAge()); // 나이 오름차순, int는 compareTo 못 씀, Integer.compare() 써야 함, this.age(내 나이)랑 o.getAge()(매개변수 나이) 비교함
		return Integer.compare(o.getAge(), this.age); // 나이 내림차순
	
	}



	@Override
	public String toString() { // 주소값 말고 입력된 값을 보고 싶으면 toString 오버라이딩 해야 함 2
		return "UserVO [name=" + name + ", age=" + age + "]";
	}

	
}
