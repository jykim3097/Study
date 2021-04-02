package _1_api.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class OuputStreamEx {

	public static void main(String[] args){
		/*
		 * OutputStream은 byte(1바이트)기반 출력 스트림
		 * 1. FileOutputStream은 파일을 쓸 때 사용하는 클래스
		 * 2. 생성자 매개값으로 파일을 쓸 파일명 포함, 전체경로를 지정한다.
		 * 3. io 패키지는 모든 클래스가 생성자에 throws키워드가 있기 때문에  try~catch를 함께 써야한다
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명>");
		String name = scan.next();
		
		FileOutputStream fos = null;
		try {
			//폴더 디렉토리 + "\\"+file이름+확장자명 
			fos = new FileOutputStream("C:\\DEV\\Academy_210215\\_210322_file\\" + name + ".txt");
			
			System.out.println("문장을 입력해주세요>");
			scan.nextLine(); //next()다음에 nextLine() 쓰면 그냥 종료가 되는 것을 해결
			String str = scan.nextLine();
			
			//getBytes() - byte stream에 값을 넣을 때는 byte로 변환을 해서 넣어줘야한다
			byte[] arr = str.getBytes();
			System.out.println(Arrays.toString(arr));
			fos.write(arr); // 파일을 byte 단위로 써내림
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // stream 닫아줘야함
			try {
				fos.close(); //닫아주지 않으면 문제가 생길 수 도 있음
				scan.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
