package _2_Quiz21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _1_FileQuiz01 {

	public static void main(String[] args) {
		
		/* 
		 * 1. 스캐너를 이용해 파일명을 정확히 입력받는다.
		 * 2. file 폴더에 스캐너로 입력받은 파일명이 있다면 filecopy폴더로 복사하세요
		 * 3. 예외처리
		 * 		1) 파일명이 없는 경우
		 * 		2) 복사 중 예외가 발생하는 경우
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명 입력>");
		String fileName = scan.next();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:\\DEV\\Academy_210215\\_210322_file\\"+fileName);
			fos = new FileOutputStream("C:\\DEV\\Academy_210215\\_210322_filecopy\\"+fileName);
			
			byte[] arr = new byte[100];
			
			int result;
			while((result = fis.read(arr)) != -1) {
				fos.write(arr, 0, result);
			}
			System.out.println("파일 복사가 정상적으로 완료되었습니다.");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e ) {
			System.out.println("복사 중 오류가 있습니다.");
		} catch (Exception e) {
			e.printStackTrace();			
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			scan.close();
		}
	}
}
