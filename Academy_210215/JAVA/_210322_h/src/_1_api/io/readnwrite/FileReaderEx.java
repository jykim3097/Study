package _1_api.io.readnwrite;

import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		/*
		 * 문자 기반으로 읽어들이는 클래스는 FileReader
		 */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\DEV\\Academy_210215\\_210322_file\\test.txt");
			
			while(true) {
				int result = fr.read();
				
				if(result == -1) break;
				System.out.print((char)result);
			}
			
		} catch (Exception e) {

		}
	}
}
