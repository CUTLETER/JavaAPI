package day15.api.io.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BfOutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙은 클래스는 성능 향상 클래스
		 * Buffered + 스트림 클래스 명으로 사용함
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello3.txt";
		
//		OutputStream os = null;
		BufferedOutputStream bos = null; // 1바이트 기반으로 데이터 씀
		BufferedInputStream bis = null;	// 1바이트를 기반으로 데이터 읽음
		
		try {
//			os = new FileOutputStream(path);
//			BufferedOutputStream bos = new BufferedOutputStream(os); 
			bos = new BufferedOutputStream(new FileOutputStream(path)); // 위에 2줄 줄여쓴 코드
			bis = new BufferedInputStream(new FileInputStream(path));
			
			//데이터를 씀
			String str = "hello world";
//			bos.write(str.getBytes(), 0, str.length());
			bos.write(str.getBytes());
			
			//flush()를 사용해서 버퍼를 비울 때 글이 써져 내려감
			bos.flush();
			
			///////////////////////////////////////////////////
			// 데이터를 읽음
			while (true) {
				int word = bis.read();
				if (word == -1) break;
				System.out.print((char)word);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
