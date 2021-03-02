
public class _2_WhileEx01 {
	public static void main(String[] args) {
		//Day03
		int a = 1; //제어변수 : 반목문의 횟수를 제어하는 변수
		int sum = 1; //누적할 변수는 무조건 바깥에 만든다!
		
		while( a < 10) {
			
			a++; //제어변수의 조작은 통해서 조건이 언젠가 false가 되게 처리
			sum += a;
		}

		System.out.println("1부터 10까지의 합 : " + sum);
	}
}
