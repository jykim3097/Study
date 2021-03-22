package _1_api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			//fw = new FileWriter("C:\\DEV\\Academy_210215\\_210322_file\\test3.txt");
			//bw = new BufferedWriter(fw);
			
			bw = new BufferedWriter(new FileWriter("C:\\DEV\\Academy_210215\\_210322_file\\test3.txt"));
			
			System.out.print("한문장> ");
			String str1 = scan.nextLine();
			System.out.print("두문장> ");
			String str2 = scan.nextLine();
			
			bw.write(str1 + "\r\n" + str2);//파일을 쓴다
			bw.flush(); // 버퍼를 비운다.
			
			System.out.println("파일이 정상 출력되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				scan.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
