
import java.util.Scanner;

public class _3_Quiz04 {
	public static void main(String[] args) {
		//키가 140 이상이고, 나이가 8세 이상이어야 놀이기구 탑승이 가능합니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력하세요");
		System.out.print("키>");
		int height = scan.nextInt();
		
		System.out.print("나이>");
		int age = scan.nextInt();
		
		if(height >= 140 && age >= 8) {
			System.out.println("놀이기구 탑승이 가능합니다.");
		} else {
			System.out.println("놀이기구 탑승이 불가능합니다.");
		}
		
		scan.close();
	}
}
