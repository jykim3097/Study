
public class _3_OperatorEx02 {
	public static void main(String[] args) {
		//Day02
		/*
		 * 2항연산자
		 */
		
		//산술연산자
		int i = 7/3; //2
		int j = 7%3; //1
		int k = 8*3; //24
		
		//비교연산자
		System.out.println(i == j); //false
		System.out.println(i != j); //true
		System.out.println(i >= j); //true
		System.out.println(i < j); //false
		System.out.println((k != 21)); //true
		System.out.println(k % 2 != 0); //false
		System.out.println(k % 2 == 0); //true
		
		//비트연산자 & | ^
		
		int a = 5; // 0000 0101
		int b = 3; // 0000 0011
		
		System.out.println(a & b); //0000 0001 - 두 비트값이 모두 1이어야 1 출력
		System.out.println(a | b); //0000 0111 - 두 비트값 중 하나만 1이어도 1 출력
		System.out.println(a ^ b); //0000 0110 - 다르면 1, 같으면 0
		
		//비트쉬프트 >>, << - 값만큼 옆으로 밀고 새로운 비트는 0으로 채운다.
		int h = 100; //0110 0100
		System.out.println(h >> 3); //1000 1100가 아니고 0000 1100
		
		
	}
}
