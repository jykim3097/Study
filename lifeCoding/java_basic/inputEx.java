package org.javatutorials.lifecoding;

import java.util.Scanner;

public class inputEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		System.out.println(i*1000);
		
		//문자가 입력 되면 프로그램이 끝남
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		
		sc.close();
	}

}
