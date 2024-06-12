package day15.api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyStreamEx {
	
	public static void main(String[] args) {
		
/*		
		Input, OutputStream 클래스는 1바이트 기반으로 파일을 읽고 쓰는데 적합함

*/		String inputPath = "C:\\Users\\user\\Desktop\\course\\java\\upload\\tree.jpg";
		String outputPath = "C:\\Users\\user\\Desktop\\course\\java\\uploadcopy\\tree_copy.jpg";

		InputStream ios = null;
		OutputStream fos = null;
		
		try {
			ios = new FileInputStream(inputPath);
			fos = new FileOutputStream(outputPath);
			
			byte[] arr = new byte[1000]; // 사진 크기가 30kb, 1000바이트씩 30번;
			
			int result; // 이런 조건 자주 씀
			while ((result = ios.read(arr)) != -1) {// read(바이트) - 길이를 반환함, 더이상 읽을 내용이 없다면 -1 반환함
				//파일 output
//				System.out.println(result); 데이터 길이, 마지막 700여개 남음
//				fos.write(arr); 그래서 이렇게 쓰면 잔여 데이터 때문에 오류날 수 있음
				fos.write(arr, 0, result); // 배열의 0~데이터길이까지 파일을 씀
			}

//			무슨 파일이든 복사 가능함
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ios.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		
		
		
		
	}

}
