package _1_api.io.buffer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

//디코딩
public class BufferedReader_UTF8 {

	public static void main(String[] args) {
		
		// InputStreamReader - byte stream과 character stream의 중간다리 역할
		InputStreamReader is = null;
		
		FileInputStream fis = null;
		BufferedReader br = null;
		
		try {
			
			//br = new BufferedReader(new FileReader("C:\\DEV\\Academy_210215\\_210322_file\\test4.txt"));
			
//			fis = new FileInputStream("C:\\DEV\\Academy_210215\\_210322_file\\test4.txt");
//			is = new InputStreamReader(fis, "EUC-KR"); // 매개변수 : InputStream, 디코딩형식
//			br = new BufferedReader(is);
			br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\DEV\\Academy_210215\\_210322_file\\test4.txt"), "EUC-KR"));
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			
		}
	}
}
