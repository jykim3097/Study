package basic;

import java.util.Scanner;

public class _1_Quiz25 {
	public static void main(String[] args) {
		//Day04
		
		/*
		 * 문제
		 * 1. Scanner를 이용하여 금액을 입력받으세요
		 * 2. 음료수를 선택하면 금액에서 차감하세요. (반복문)
		 * 3. 금액이 부족하다면 "금액이 부족합니다"를 출력하세요.
		 * 4. 4를 입력 받으면 반복문을 종료하세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 투입해주세요> ");
		int money = scan.nextInt();
		
		es:while(true) {
			System.out.println("남은금액: "+ money+ "원");
			System.out.println("[1]뎀이소다 : 400원, [2]밀킥스 : 500원, [3]코가골라 : 600원, [4]잔돈받기");
			System.out.print("음료수 선택> ");
			int n = scan.nextInt();
			
			switch(n) {
			case 1:
				if(money >= 400) {
					money -= 400;
					System.out.println("뎀이소다를 받았습니다.\n");
				} else {
					System.out.println("금액이 부족합니다. 돈을 넣어주세요.\n");
				}
				break;
			case 2:
				if(money >= 500) {
					money -= 500;					
					System.out.println("밀킥스를 받았습니다.\n");
				} else {
					System.out.println("금액이 부족합니다. 돈을 넣어주세요.\n");
				}
				break;
			case 3:
				if(money >= 600) {
					money -= 600;					
					System.out.println("코가골라를 받았습니다.\n");
				} else {
					System.out.println("금액이 부족합니다. 돈을 넣어주세요.\n");
				}
				break;
			case 4:
				System.out.println("남은 금액"+money+"원을 반환합니다.\n");
				break es;
			}
		}
		scan.close();
	}
}
