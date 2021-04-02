package _1_api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamCopy {

	public static void main(String[] args) {
		
		//파일 복사로 옮기기
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//이미지, 동영상, 엑셀 파일 등등 모두 복사해서 쓸 수 있다.
			
			//읽어서
			//읽어들일 경로 / 읽어올 파일 : jiyoung.jpg
			fis = new FileInputStream("C:\\DEV\\Academy_210215\\workspace\\_210322_h\\src\\_1_api\\io\\stream\\jiyoung.jpg");
			
			//쓴다
			//복사할 경로
			fos = new FileOutputStream("C:\\DEV\\Academy_210215\\_210322_filecopy\\jiyoung.png");

			byte[] arr = new byte[100]; //100byte 단위로 읽음
			
			while(true) {
				int result = fis.read(arr); //읽은 데이터의 크기
				if(result == -1) break; //데이터 마지막에 도착
				
				//한줄씩 데이터를 옮긴다, 읽음과 동시에 쓴다
				fos.write(arr, 0, result); //arr의 0부터 result길이까지 읽은 걸 쓴다
			}
			
//			int result;
//			while((result = fis.read(arr)) != -1) {
//				fos.write(arr, 0, result);
//			}
			
			System.out.println("파일 복사가 정상 처리되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
