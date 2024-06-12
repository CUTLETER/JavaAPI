package day15.api.io.readwrite;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class FileReaderEx {
	
	public static void main(String[] args) {
		
		/*
		 * 문자 기반으로 읽어들이는 클래스 - FileReader 클래스
		 * 2바이트 단위여서 문자 읽기에 적합함
		 * 
		 */
		String path ="C:\\Users\\user\\Desktop\\course\\java\\upload\\hello2.txt";
		
		Reader rd = null;
		
		
		try {
			rd = new FileReader(path);
			
			//한 글자씩 읽기
			while (true) {
			int word = rd.read();
			if (word == -1) { // -1 이면 더이상 읽어낼 데이터가 없음
				break;
			}
			System.out.print((char)word);
			}
		
//			char[] arr = new char[100];
//			int length = rd.read(arr);
//			System.out.println(Arrays.toString(arr));
//			int i=0;
//			while (i<length;) {
//				System.out.print((char)arr[i]);
//					i++;
//			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rd.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
