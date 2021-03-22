package _1_api.io.readnwrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		/*
		 * 문자를 써서 저장할 때, 사용하는 클래스는 FileWriter 클래스입니다.
		 * 기본적으로 2byte 단위로 문자를 읽고 쓰기 때문에 문자 쓰기에 적합
		 */
		
		FileWriter fw = null;
		
		try {
			//기본적으로 똑같은 파일명에는 덮어 씌어줌
			fw = new FileWriter("C:\\DEV\\Academy_210215\\_210322_file\\test.txt");
			
			String str = "I'm jiyoung! \r\nI'm joonyoung!";
			fw.write(str); //writer 메서드는 문자열 자체를 받을 수 있다.
		
			System.out.println("입력되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e2) {

			}
		}
	}
}
