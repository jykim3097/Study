package _4_quiz15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass01 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 1. 스캐너를 통해서 정수 2개를 입력 받는다.
		 * 2. 입력 받은 값이 정수라면, 단순히 정수의 합을 출력하고 반복문을 종료한다.
		 * 3. 만약 입력받은 값이 예외를 발생시키는 값이라면, "정수로만 입력하세요"를 출력한 다음에
		 *    다시 처음부터 입력받는다.
		 * 4. 반복문을 탈출하면 프로그램 종료 구문을 띄우세요
		 * 
		 * ex) 무한루프
		 */
		
		/*
		 * Scanner를 밖에서 설정하면 무한루프 에러가 발생한다.
		 * 
		 * 자바에서 실제로 문자를 입력받는 구문은 BufferedReader이다.
		 */
//		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
//		String s = rd.readLine();

		Scanner scan = new Scanner(System.in);
		while(true) {
			
			//1st
//			try {
//				Scanner scan = new Scanner(System.in);
//				System.out.print(">");
//				int a = scan.nextInt();
//				System.out.print(">");
//				int b = scan.nextInt();
//				
//				System.out.println(a+b);
//				break;
//				
//			} catch (Exception e) {
//				System.out.println("정수로만 입력하세요");
//				scan.nextLine(); //엔터값의 제거
//			}
			
		//2nd
		try {
			System.out.print(">");
			int a = Integer.parseInt(scan.nextLine());
			//int a = scan.nextInt();
			System.out.print(">");
			int b = Integer.parseInt(scan.nextLine());
			//int b = scan.nextInt();
			
			System.out.println("결과: " + (a+b));
			break;
		} catch (Exception e) {
			System.out.println("정수로만 입력하세요");
		}
		
		}
		
	}

}
