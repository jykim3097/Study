package _210225_h;

import java.util.Scanner;

public class _3_StudentManager {
	static Scanner scan = new Scanner(System.in);
	
	//학생정보를 저장하는 배열 3개
	static String[] name = new String[100];
	static String[] gender = new String[100];
	static int[] age = new int[100];
	
	static int count = 0; // 사람 수 count - 현재 사람 수가 몇 명이 저장되어있는지 알기 위한 변수
	static int index = -1; // index(위치)를 조정하기 위한 변수

	public static void main(String[] args) {
		
		
		es:while(true) {
			System.out.println("[info] 고객 수 : " + count + ", 현재 위치 : "+index);
			System.out.println("[menu] (i) Insert (p) Prev (n) Next (c) Current (u) Update (d) Delete (q) quit");
			
			System.out.print("메뉴> ");
			String menu = scan.next();
			
			switch(menu) {
			case "i" : //insert
				System.out.println("========== 고객 정보 입력 ==========");
				//이름, 성별, 나이를 입력 받아 배열에 순서대로 저장, 사람 수 증가
				insert();
				
				System.out.println("================================");
				break;
				
			case "p" : //prev
				System.out.println("========== 이전 고객 정보 ==========");
				//index 번호가 0 이하면 "이전 정보가 없습니다" 출력,
				//그렇지 않으면 index를 이동해서 이전 고객 정보를 보여준다.
				
				if(index < 1) {
					System.out.println("이전 정보가 없습니다.");
				} else {
					index--;
					System.out.println(name[index]+", "+gender[index]+", "+age[index]);
				}
				
				System.out.println("================================");

				break;
				
			case "n" :
				System.out.println("========== 다음 고객 정보 ==========");
				//다음 고객 정보를 출력할 수 없는 조건 고려 - "다음 정보가 없습니다" 출력
				//그렇지 않으면 index를 이동하고 다음 고객 정보를 보여준다.
				//index, count와 연관이 있다. delete가 일어나면 변경이 된다.
				//index와 count가 같아지면 안된다.
				
				if(index >= count -1) { 
					System.out.println("다음 정보가 없습니다.");
				}else {
					index++;
					System.out.println(name[index]+", "+gender[index]+", "+age[index]);					
				}
						
				System.out.println("================================");

				break;
				
			//c,u,d는 조건이 똑같다
			case "c" :
				System.out.println("========== 현재 고객 정보 ==========");
				//현재 고객정보를 출력할 수 있는 조건 고려해서 현재 정보를 출력
				//힌트: index가 ??보다 크고 ??보다 작아야함 - 삭제가 일어날 경우를 고려

				if(index >= 0 && index < count) { //출력가능한 현재 위치
					System.out.println(name[index]+", "+gender[index]+", "+age[index]);		
				} else {
					System.out.println("현재 고객 정보가 없습니다.");
				}
				
				System.out.println("================================");

				break;
				
			case "u" :
				System.out.println("========== 현재 고객 정보 수정 ==========");
				//현재 고객 정보를 출력할 수 있는 조건을 고려해서 스캐너를 통해 이름 , 성별, 나이를 받아 수정
				
				if(index >=0 && index < count) {
					System.out.println(name[index] +"님 정보를 수정합니다.");
					
					System.out.print("수정할 이름> ");
					name[index] = scan.next();
					
					System.out.print("성별 입력> ");
					gender[index] = scan.next();
					
					System.out.print("나이 입력> ");
					age[index] = scan.nextInt();
					
					System.out.println("정보 수정 완료");
				} else {
					System.out.println("수정할 정보가 없습니다.");
				}
				
				System.out.println("================================");
				break;
				
			case "d" :
				System.out.println("========== 현재 고객 정보 삭제 ==========");
				//현재 고객정보를 삭제할 수 있는 조건을 고려해서 현재 위치부터 뒤에 있는 배열요소를 당겨와서 수정
				
				if(index >=0 && index < count) {
					for(int i=index; i<count-1; i++) {
						name[i] = name[i+1];
						gender[i] = gender[i+1];
						age[i] = age[i+1];
					}
					count--;
					System.out.println("삭제되었습니다.");
				}else {
					System.out.println("삭제할 정보가 없습니다.");
				}
				
				System.out.println("================================");
				break;
			
			case "q" :
				//while문 탈출시키고 종료		
				break es;
				
			default :
				System.out.println("잘못 입력했습니다.");
				break;
			}
			
		}	
	} //end main
	
	static void insert() {
		
		System.out.print("이름 입력> ");
		name[count] = scan.next();
		
		System.out.print("성별 입력> ");
		gender[count] = scan.next();
		
		System.out.print("나이 입력> ");
		age[count] = scan.nextInt();
		count++;
		index++;
	}
}
