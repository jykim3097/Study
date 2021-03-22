package _1_api.io.folder;

import java.io.File;

public class CreateFileEx {

	public static void main(String[] args) {
		
		//폴더를 생성하는 방법, File클래스를 이용
		
		try {
			File folder = new File("C:\\DEV\\Academy_210215\\_210322_filetest");
			
			if(!folder.exists()) { //폴더가 존재하면 true, 존재하지 않으면 false
				folder.mkdir(); //폴더 생성
				System.out.println("폴더 생성 성공");
			} else {
				System.out.println("해당 폴더가 이미 존재합니다.");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
