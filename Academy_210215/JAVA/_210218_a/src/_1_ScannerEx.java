import java.util.Scanner;

public class _1_ScannerEx {
	public static void main(String[] args) {
		//Day02
		
		//stream(->) : 눈에 보이지 않는 통로, 키보드 -> 시스템 -> 모니터
		//data가 이 stream을 지나가는데, 이때 데이터가 많아지면 buffer 형태의 묶음으로 stream을 통과한다.
				
		//1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너가 ㅏ지고 있는 기능을 사용해서 데이터를 입력받음
		System.out.print("이름> ");
		String name = scan.next(); //문자열을 입력받음

		System.out.print("나이> ");
		int age = scan.nextInt(); //정수를 입력받음
		
		System.out.print("키> ");
		double height = scan.nextDouble();
		
		System.out.println("안녕하세요. 제 이름은 " + name + "이고, 나이는 " + age + "세입니다. 키는 " + height + "cm입니다.");
		
		//3. 스캐너에 대한 자원 해제
		scan.close();
	}
}
