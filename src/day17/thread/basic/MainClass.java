package day17.thread.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		
//		객체 n개, 스레드를 n개로 동작시킴 (따로 따로)
		
//		1. 먼저 객체 생성함
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		
//		2. Runnable 인터페이스를 상속받은 경우는 스레드 객체를 생성해서 동작시킴
		Thread thread1 = new Thread(/*new 익명객체 또는 구현객체를 람다식으로*/m1, "스레드명-A");
		Thread thread2 = new Thread(m2, "스레드명-B");
		
		thread1.start();
		thread2.start();
		
		System.out.println("main 스레드 정상 종료");
		
	}

}
