
public class _1_MethodEx01 {
	public static void main(String[] args) {
		/*
		 * 1. 메서드(함수)는 메서드 내부에 선언할 수 없다.
		 * 2. 메서드는 만드는 과정과 사용하는 과정(호출하는 과정)이 있다.
		 */
		int result = calSum();
		System.out.println("2. 1~10까지의 합: " + result);
	
		String result2 = strPlus();
		System.out.println(result2);
		
		String rsp = randomStr();
		System.out.println(rsp);
	}
	
	static int calSum() {

		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		return sum;
	
	}
	
	static String strPlus() {

		
		String str = ""; //공백
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
	
		return str;
	}

	static String randomStr() {
		
		double d = Math.random(); // 1.0미만
		
//		String s = "";
		if(d <= 0.3) {
			//s = "가위";
			return "가위";
		} else if (d <= 0.6) {
			//s = "바위";
			return "바위";
		} else {
			//s = "보";
			return "보";
		}
		
	}
	
	
}
