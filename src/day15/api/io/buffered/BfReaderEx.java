package day15.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BfReaderEx {

	public static void main(String[] args) {
		
		//빠른 입력

		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello4.txt";
		BufferedReader br = null;
		
		
		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			System.out.print("입력 >");
//			String str = br.readLine(); // 한 줄 통째로 받기
//			System.out.println(str);
			
			br = new BufferedReader(new FileReader(path));
			
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine()); // 읽을 게 없으면 null값 뜸
			
			String str;
			while ((str=br.readLine()) != null) { //읽어서 데이터를 str에 저장함
				System.out.println(str);
			}
			
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
