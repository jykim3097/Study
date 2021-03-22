package _1_api.io.stream;

import java.io.FileInputStream;

public class InputStreamEx {

	public static void main(String[] args) {

		/*
		 * 1. 파일을 바이트 단위로 읽을 때 사용하는 클래스 FileInputStream 클래스이다
		 * 2. 생성자 매개변수로 읽어들일 파일의 전체 경로를 적는다
		 */

		//나중을 생각해서 초기화는 밖에
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\DEV\\Academy_210215\\_210322_file\\test.txt");

			//1바이트 단위로 읽기
//			while(true) {
//				
//				//.read() Returns : the next byte of data, or -1 if the end of the file is reached.
//				int result = fis.read();
//				if(result == -1) break;
//
//				System.out.print((char)result);
//			}
			
			//배열로 받아오기
			byte[] arr = new byte[100];
			int result = fis.read(arr); //토탈 데이터 값을 받는다, 읽어들인 바이트의 크기를 반환
			
			int i=0;
			while(true) {
				if(arr[i] == 0) {
					break;
				}

				System.out.print((char)arr[i]);
				i++;
			}
			
			System.out.println("\n-------------");
			
			for(int j = 0; j<result; j++) {
				System.out.print((char)arr[j]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
