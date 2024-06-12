package day16.ramda.anonymous.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Car car = new Tico(); // 오버라이딩된 메소드가 실행된다
		car.run();
		
		// 매번 Car를 구현한 클래스가 달라져야 한다면? ex) 볼보, 지프 등
		// -> 익명 객체 문법으로 해결
		Car car2 = new Car() {
			
			@Override
			public void run() {
				System.out.println("티코 티코");
				
			} 
		}; car2.run();
		
		Car car3 = new Car() {
			
			@Override
			public void run() {
				System.out.println("이제 그만");
				
			}
		}; car3.run();
		
		
		System.out.println("------------------------");
		
		
		//Tv에 있는 리모컨 사용하기
		Tv tv = new Tv();
//		RemoteControl r = tv.remote;
//		r.volumeDown();
		tv.remote.volumeUp();
		tv.remote.volumeDown();
		tv.remote.turnOn();
		tv.remote.turnOff();
	}

}
