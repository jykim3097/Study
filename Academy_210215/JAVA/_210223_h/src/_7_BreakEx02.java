import java.util.Scanner;

public class _7_BreakEx02 {
	public static void main(String[] args) {
		//Day04
		Scanner scan = new Scanner(System.in);

		while(true) {
			
			System.out.println("4 X 6 = ? ");	
			
			System.out.print(">");
			int answer = scan.nextInt();
			
			if(answer == 24) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("틀렸습니다.");
			}
		}
		
		scan.close();
	}
}
