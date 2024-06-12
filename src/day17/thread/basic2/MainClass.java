package day17.thread.basic2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m1 = new MyThread(); // MyThread가 스레드 역할 대신 해줌 2, 그래서 Thread 생성 없이 MyThread를 여러 개 생성함
		m1.setName("스레드명-A");
		m1.start();
		
		MyThread m2 = new MyThread();
		m2.setName("스레드명-B");
		m2.start();
		
		System.out.println("main 스레드 정상 종료");
		

	}

}
