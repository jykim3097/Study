package org.javatutorials.lifecoding;

import java.util.Scanner;

public class inputEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		System.out.println(i*1000);
		
		//���ڰ� �Է� �Ǹ� ���α׷��� ����
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		
		sc.close();
	}

}
