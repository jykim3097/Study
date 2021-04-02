package _1_api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		/*
		 * 2바이트 기반 문자를 읽는 성능 향상 스트림 BufferedReader
		 */
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("C:\\DEV\\Academy_210215\\_210322_file\\test3.txt"));
			
			//BufferedReader는 readLine() 메서드가 있고 한줄을 통째로 읽어들인다.
			//한 글자 단위로 읽는 것 - fr.read()
			//한 줄 단위로 읽는 것

			String str;
			while( (str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
