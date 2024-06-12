package day13.api.lang.system;

import java.util.Properties;

public class SystemEx01 {
	
	public static void main(String[] args) {
		
		//시스템 클래스는 static메소드로 전부 정의되어 있음 new System(); 사용 XXX
//		System.exit(0); // 프로그램 종료
//		System.out.println("프로그램 종료라 출력되지 않음");
		
		
//		Properties p = System.getProperties(); // 운영체제 관련된 내용들을 얻을 수 있음
//		System.out.println(p);
		
		long start = System.currentTimeMillis(); // 메소드에 마우스 올려보면 java.lang 보다 앞에 나온 게 반환 타입
		
		String str = "";
		for (long i=1; i<=100000L; i++) {
			str += "A";
		}
		
		long end = System.currentTimeMillis();
		System.out.println("코드 실행 소요 시간 : "+(end-start)*0.001);
		
		
		
		
		
	}
	
}
