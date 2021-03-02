import java.util.Scanner;

public class _910_Quiz24_1 {
	public static void main(String[] args) {
		//Day04
		
		Scanner scan = new Scanner(System.in);
		
		int yes = 0;
		int no = 0;
		
		while(true) {
			int a = (int)(Math.random()*100)+1;
			int b = (int)(Math.random()*100)+1;
			int o = (int)(Math.random()*2);
			
			if(o == 0) {
				System.out.println(a + " + " + b + " = ?");
			} else {
				System.out.println(a + " - " + b + " = ?");
			}
			
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print("> ");
			int result = scan.nextInt();
			
			if (result == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("---------------------");
				
				System.out.println("정답 횟수: " + yes + "회");
				System.out.println("오답 횟수: " + no + "회");
				break;
				
			} else if ( result == a+b && o == 0) {
				
				System.out.println("정답입니다!!");
				yes++;
			
			} else if( result == a-b && o == 1) {
			
				System.out.println("정답입니다!!");
				yes++;
			
			} else if (result == 0) {
			
				System.out.println("프로그램을 종료합니다.");
				System.out.println("---------------------");
				
				System.out.println("정답 횟수: " + yes + "회");
				System.out.println("오답 횟수: " + no + "회");
				break;
				
			} else {
			
				System.out.println("틀렸습니다.");
				no++;
			}
			
			System.out.println("---------------------");
			
		}
		
		scan.close();
	}
}
