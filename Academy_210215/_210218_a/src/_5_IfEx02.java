import java.util.Scanner;

public class _5_IfEx02 {
	public static void main(String[] args) {
		//Day03
		//입력받은 정수를 A, B, C, D, F 등급으로 분리
		Scanner scan = new Scanner(System.in);
		System.out.print("점수>");
		int point = scan.nextInt();
		
		//조건을 잘 설정해서 모든 구문이 실행가능하게 해야한다.
		if(point > 90) { // 91 ~ 100
			if(point > 100) { 
				System.out.println("잘못된 점수입니다.");
			} else if (point >= 95) {
				System.out.println("A+학점입니다.");
			} else {
				System.out.println("A학점입니다.");
			}
		} else if (point > 80) { // 81 ~ 90
			System.out.println("B학점입니다.");
		} else if (point > 70) { // 71 ~ 80
			System.out.println("C학점입니다.");
		} else if (point > 60) { // 61 ~ 70
			System.out.println("D학점입니다.");
		} else { // 60점 이하 
			System.out.println("F학점입니다.");
		}
		
		scan.close();
	}
}
