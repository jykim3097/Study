package _1_api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙은 클래스는 입출력 성능 향상을 위한 클래스이며
		 * OutputStream은 byte 기반이다.
		 * 
		 * Buffered는 생성자의 매개변수로 입출력 클래스를 전달받는다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		//FileOutputStream fos = null;
		BufferedOutputStream bf = null;

		try {
		
//			fos = new FileOutputStream("C:\\DEV\\Academy_210215\\_210322_file\\test2.txt");
//			BufferedOutputStream bf = new BufferedOutputStream(fos);

			bf = new BufferedOutputStream(new FileOutputStream("C:\\DEV\\Academy_210215\\_210322_file\\test2.txt"));
			
			System.out.print("입력할 문장> ");
			String str = scan.nextLine();
			
			//String 타입을 바꿔서 byte 배열을 받는다
			bf.write(str.getBytes());
			
			//다 모아서 보내는 명령을 해줘야함
			bf.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
				scan.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
