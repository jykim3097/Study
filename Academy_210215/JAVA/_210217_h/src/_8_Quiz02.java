

public class _8_Quiz02 {
	public static void main(String[] args) {
		//1. 1~100까지 랜덤한 함수를 생성하고, 3의 배수인지 아닌지 3항연산식으로 판별
			int n = (int)(Math.random()*100)+1;
			String result1 = n%3 == 0 ? "3의 배수이다" : "3의 배수가 아니다";
			System.out.println(result1);
			
		//2. -5~5까지 랜덤한 정수를 생성하고, 무조건 절댓값만 출력하는 3항연산식 만들기
			int m = (int)(Math.random()*11 - 5);
			int result2 = m >= 0 ? m : -m;
			System.out.println("m = "+m+", "+result2);
			
		//3. 1~200까지의 랜덤한 수를 만드는데 이것을 사과의 갯수라고 가정한다.
		//   bucket은 사과를 담는 바구니인데 최대 10개까지만 들어간다.
		//   어떤 사과가 나오던 필요한 바구니의 개수를 구하는 3항연산식 구하기
			int k = (int)(Math.random()*100 + 1); // 사과의 갯수
			int result3 = k%10 == 0 ? k/10 : k/10+1;
			System.out.println("k = " + k + ", " + result3 + "개");
	}
}
