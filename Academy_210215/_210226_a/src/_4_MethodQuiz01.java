import java.util.Arrays;

public class _4_MethodQuiz01 {
	public static void main(String[] args) {
		
		System.out.print("method1:");
		method1();
		System.out.println("method2:"+method2("지영"));
		System.out.println("method3:"+method3(1,2,3.0));
		System.out.println("method4:"+method4(4));
		System.out.println("method5:");
		method5("안녕 ",7);
		System.out.println("maxNum:"+maxNum(24, 65.7));
		System.out.println("abs:"+abs(-78));
		
		char[] c = {'a','b','A','B'};
		System.out.println("method6:"+method6(c));
		
		int[] iArr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("method7:"+method7(iArr));
		
		System.out.println(Arrays.toString(method8("지영","안녕")));
	}
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String str) {
		return str;
	}
	
	static double method3(int a, int b, double c) {
		return a+b+c;
	}
	
	static String method4(int a) {
		//간단한 if문은 삼항연산자로 나타내자
		return a % 2 == 0 ? "짝수" : "홀수";
	}
	
	static void method5(String s, int end) {
		for(int i=0; i<end; i++) {
			System.out.println(s);
		}
	}
	
	static double maxNum(double a, double b) {		
		return a>b ? a : b;
	}
	
	static int abs(int a) {
		return a<0 ? -a : a;
	}
	
	static String method6(char[] c) {
		
		String s = "";
		
		//내 코드
//		for(int i=0; i<c.length; i++) {
//			s+=c[i];
//		}
		
		//쌤 코드
		for(char i : c) {
			s += i;
		}
		
		return s;
	}
	
	static int method7(int[] iArr) {
		
		int sum = 0;
		for(int i=0; i<iArr.length; i++) {
			sum += iArr[i];
		}
		
		return sum;
	}
	
	static String[] method8(String s1, String s2) {
		
		String[] sArr = {s1, s2};
		
		return sArr;
	}
}
