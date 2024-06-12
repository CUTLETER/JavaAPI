package day15.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class BfWriterEx {

	public static void main(String[] args) {
		
		/*
		 * BufferedWriter 클래스는 문자열 2바이트 기반의 성능 향상 보조 스트림
		 * 빠른 출력에 사용됨
		 */
		
//		출력 (System.out)
//		Writer w = new OutputStreamWriter(System.out); // 1바이트 기반의 데이터를 writer 타입으로 중간에서 바꿔주는 매개체
//		BufferedWriter bw = new BufferedWriter(w);
//		bw.write("안녕하세요?");
//		bw.flush();	
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello4.txt";

		
//		파일 생성	FileWriter(path)	 
		BufferedWriter bw = null;
		try {
			
			bw = new BufferedWriter(new FileWriter(path));
			bw.write("안녕하세요?\n모두\n잠에서\n일어나"); // \n 줄바뀜, \r cursor 앞으로 당기기 - window에선 개행
																					
																									
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
		
		
		
	}
}
