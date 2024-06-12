package day17.thread.basic;

public class MyThread implements Runnable { // 보통 Runnable 객체 구현하는 방식을 많이 씀

	private int num;
	
	@Override // run() 메소드를 반드시 오버라이딩 해야 함
	public /*synchronized - 스레드 A와 B 침범 방지 키워드*/ void run() { 
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i++) {
			num++; // 10번 증가
			
			System.out.println(Thread.currentThread().getName()+" : "+num); // .currentThread() 현재 스레드명

			try {
				
				if (Thread.currentThread().getName().equals("스레드명-A")) {
					Thread.sleep(1000); // 스레드가 반복 돌고 1초 멈춤, 1초 지나면 다시 반복 실행, 총 10초, try-catch구문으로 감싸줘야 함
				} else {
					Thread.sleep(5000);
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
		
	}

}
