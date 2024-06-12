package day13.api.lang.buffer;

public class StringTest {
	
	public static void main(String[] args) {
		
		// 문자열과 빠른 문자열의 속도 비교
		long start = System.currentTimeMillis();
		
			
//		String s = "";
//		for (int i=1; i<=200000; i++) { 
//			s += "A"; 원본 A -> 사본 AA 생성 -> 사본 AAA -> 끊임없이 생성함
//		}
		
		StringBuffer s = new StringBuffer();
		
		for(int i=1; i<=200000; i++) {
			s.append("A"); // 원본 A에다가 AAAAAAAAAAAAAA 더해감
		} 
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("소요 시간 : "+ (end-start)*0.001);
		
		
		
		
		
	}

}
