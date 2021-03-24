package _2_Quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _2_FileQuiz02 {

	public static void main(String[] args) {
		/*
		 * 1. BufferedWriter, Date클래스 이용해서 file 폴더 경로에 오늘 날짜 ex)20210322.txt 이름으로 파일을 쓴다 - 내일이면 날짜가 바뀌겠죠?
		 * 2. 내용은 아무거나 작성하세요
		 * 3. 파일을 정상적으로 썼다면 BufferedReader를 통해서 읽어들이세요
		 * 
		 */
		
		BufferedWriter bw = null;
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);
		
		try {
			
			bw = new BufferedWriter(new FileWriter("C:\\DEV\\Academy_210215\\_210322_file\\"+today+".txt"));
			bw.write(today+"! 오늘도 화이팅!!!");
			bw.flush();
			
			System.out.println("파일이 정상 출력되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println();
		
		// 파일 읽기
		BufferedReader br = null; // 인코딩 타입을 잘 확인해야한다.
		
		try {
			
			br = new BufferedReader(new FileReader("C:\\DEV\\Academy_210215\\_210322_file\\"+today+".txt"));
			
			String str;
			while(!(str = br.readLine()).equals(null)) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			try {
				br.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
