package day15.api.io.directory;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		
		/*
		 * 외부 경로로 폴더를 생성할 때 file클래스를 사용함
		 */
		
//		File file = new File("폴더 생성 경로");
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\새로운폴더";
		
		
		try {
			File file = new File(path);
			
//			//폴더가 있는지 확인하고 생성하기
//			if (!file.exists()) { // 존재하면 true, 아니면 false -> 그래서 ! 붙여줌
//				file.mkdir();
//				file.mkdirs() - 파일 뿐만 아니라 생성경로도 생성해줌
//			} else {
//				System.out.println("폴더가 존재함");
//			}
//			
//			
			
			//폴더 삭제
			if (file.exists()) {
				file.delete(); // 빈 폴더 삭제할 때 (파일이 폴더 안에 있으면 삭제XX)
				System.out.println("삭제 성공");
			} else {
				System.out.println("실패");
			}

			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
	}
}
