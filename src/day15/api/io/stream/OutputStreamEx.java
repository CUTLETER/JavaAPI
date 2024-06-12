package day15.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		
/*		Output이 붙어 있는 클래스는 1바이트 기반의 출력 스트림 클래스
		1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream
		2. io패키지에 모든 클래스는 throws가 있어서 반드시 try~catch 처리해야 함

*/
//		OutputStream fos = new FileOutputStream("파일을 내보내는 경로");
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello.txt"; // 앞으로의 모든 파일 업로드 경로는 여기로!, 파일명까지 포함해서 적어야 함
		//  역슬래쉬 \ 하나만 쓰면 탈출 처리돼서 \\ 2개 써야 함
		
		
		
		OutputStream fos = null; // 그래서 이렇게 try밖으로 빼서 따로 선언해줌 - 3
		
		try {
			 fos = new FileOutputStream(path);
			
			//출력할 문자
			String str = "hello world? nice to meet you";
			fos.write(str.getBytes());
				
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
		} finally {
			try { // fos.close() 또한 try~catch 처리 해야 함 - 4
				fos.close(); // finally 구문 안에서 스트림 자원 해제 시킴 - 1, fos 변수가 try구문 안에서 선언된 거라 오류남 - 2
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		

		
		
		
		
	}

}
