
public class _2_MethodEx02 {
	public static void main(String[] args) {
		/*
		 * 매개변수(parameter)
		 * 1. 매개변수는 메서드 호출 시 실행에 필요한 값을 전달하는 매개체
		 * 2. 매개변수를 몇 개 받을 지는 메서드를 선언할 때 결정한다.
		 * 
		 */
		System.out.println(calSum(10));
		System.out.println(calSum(100));
		System.out.println(calSum(50));
		
		System.out.println(calSum2(10, 20));
		
		System.out.println(strPlus2(2,5,"abc"));
	}
	
	static int calSum(int end) {
		
		int sum = 0;
		for(int i=1; i<=end; i++) {
			sum +=i;
		}
		
		return sum;
	}
	
	
	static int calSum2 (int start, int end) {
		
		int sum  = 0;
		for(int i= start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
	
	//정수 2개, 문자열 1개를 매개변수로 전달받는 calSum3()
	//기능 - 두 정수 사이의 차 만큼 문자열을 붙인 결과를 반환
	
	static String strPlus2(int a, int b, String str) {
		
		int min, max=0;
		if(a>b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		String result = "";
		for(int i=min; i<= max; i++) {
			result += str;
		}
		
		return result;
	}
	
	
}
