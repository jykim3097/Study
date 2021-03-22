package _1_api.io.folder;

import java.io.File;

public class DeleteFileEx {

	public static void main(String[] args) {
		
		try {
			
			File folder = new File("C:\\DEV\\Academy_210215\\_210322_filetest");
			
			if(folder.exists()) { //존재하면 삭제
				folder.delete(); //폴더 삭제
				System.out.println("폴더를 삭제했습니다.");
			} else {
				System.out.println("폴더가 없습니다.");
			}
			
		} catch (Exception e) {
		
		}
	}
}
