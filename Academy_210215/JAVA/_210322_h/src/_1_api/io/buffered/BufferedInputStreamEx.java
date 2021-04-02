package _1_api.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
		
		/*
		 *  BufferedInputStream은 바이트 기반 성능 향상 스트림이다.
		 *  문자 타입을 쓰기에는 적합하지 않다.
		 *	한글은 2byte이기 때문에 문제가 발생한다.
		 */
//		FileInputStream fis = null;
		BufferedInputStream bf = null; 
		
		try {
//			fis = new FileInputStream("C:\\DEV\\Academy_210215\\_210322_file\\test2.txt");
//			bf = new BufferedInputStream(fis);

			bf = new BufferedInputStream(new FileInputStream("C:\\DEV\\Academy_210215\\_210322_file\\test2.txt"));
			
			while(true) {
				int result = bf.read();
				if(result == -1) break;
				
				System.out.print((char)result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
