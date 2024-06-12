package day15.api.io.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {
	
	public static void main(String[] args) {
		
/*		Input이 붙어 있는 클래스는 1바이트 기반의 입력 스트림 클래스
 		1. 파일을 읽어들이는데 사용하는 클래스가 FileInputStream
*/		
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello.txt"; // 경로에 파일명까지 포함해서 적기
		
		InputStream ios = null;
		
		try {
			ios = new FileInputStream(path);
			
			//1바이트씩 읽기
//			System.out.println(ios.read()); 자음모음 따로 읽어냄, 읽어낼 글자가 없으면 -1 출력됨

			while(true) {
				int data = ios.read();
				if (data == -1) break; // 그래서 중지 조건으로 -1 걸어둠
				System.out.println(data);
//				System.out.println((char)data); 문자는 2바이트인데 inputstream은 1바이트로 데이터를 읽어들임 -> 한글은 출력이 깨짐, 영어는 아스키 코드가 있어서 괜찮음
				
			//바이트 배열로 한번에 읽기
				byte[] arr = new byte[100]; // 100글자
				int length = ios.read(arr); // 읽은 내용을 arr에 저장시킴, 길이를 반환시켜줌
				System.out.println("데이터를 읽은 길이 : "+length);
				System.out.println(Arrays.toString(arr));
				
			//바이트 배열을 반복시켜서 글자 출력하기
				int i = 0;
				while(i<length) {
					System.out.print((char)arr[i]);
					i++;
				}
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ios.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}

}
