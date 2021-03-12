package _1_exception.throw_;

public class ThrowEx01 {

	public static void main(String[] args) {
		
		//예외 만들기
		//메서드, 생성자에서 실행 도중 throw 키워드를 만나면
		//즉시 예외를 만들고, 예외 처리 구문을 찾는다
		//예외가 만들어지면 코드가 즉시 중단되고, 가까이 있는 예외처리 구문으로 이동하게 된다.(catch)
		
		try {
			System.out.println("결과: " + calSum(3));
			System.out.println("결과: " + calSum(-5));
			
		} catch (Exception e) {
			//System.out.println("양수를 입력하세요");
			//System.out.println(e.getMessage()); //예외 발생시 전달한 예외 메세지를 얻어옴
			e.printStackTrace(); //예외 로그 출력
		}
		
		System.out.println("프로그램 정상 종료");
	}
	
	//매개 값을 받아서 합계를 구해라
	public static int calSum(int b) throws Exception {
		
		if(b < 0 ) {
			throw new Exception("양수를 입력하세요"); // 매개변수가 있는 생성자
		}
		int sum = 0;
		for(int i=1; i<=b; i++) {
			sum += i;
		}
		return sum;
	}
}
