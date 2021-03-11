package _2_quiz14;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		GrapeMusic gm = new GrapeMusic();
		
		while(true) {
			
			System.out.println("[메뉴] 1.추가  2.재셍  3.현재음악개수 4.종료");
			System.out.print("> ");
			String menu = scan.next();
			
			if( menu.equals("추가") || menu.equals("1")) {
				
				System.out.print("> ");
				String song = scan.next();
				gm.insertList(song);
				
			} else if ( menu.equals("재생") || menu.equals("2")) {
				
				if(gm.playLength() == 0) {
					System.out.println("플레이리스트에 추가된 노래가 없습니다.");
				} else {					
					gm.playList();
				}
			} else if ( menu.equals("현재음악개수") || menu.equals("3")) {
				System.out.println(gm.playLength());
			} else if ( menu.equals("종료") || menu.equals("4")) {
				return;	
			} else {
				System.out.println("잘못 입력했습니다. 다시 실행해주세요.");
			}
		}
	}
}
