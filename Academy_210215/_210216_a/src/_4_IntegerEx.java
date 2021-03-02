
public class _4_IntegerEx {

	public static void main(String[] args) {
		//Day01
		//정수형 타입
		byte a = 127; // byte는 양수 127까지만 저장 가능
		byte a1 = -128; // 음수는 -128까지 저장 가능
		
		short b = 32767; //2의 15승
		short b1 = -32768;
		
		int c = 2147483647; // 2의 30승?
		int c1 = -2147483648;
		
		long d = 2147489648l;
		System.out.println(d); // l 때고 출력됨
		
		System.out.println("----------------------------");
		
		//2진수 or 8진수 or 16진수로 저장할 수 있다.
		//2진수는 0b를 붙임
		
		int bin = 0b1010;
		System.out.println("이진수 1010의 값은 : "+bin);
		
		//8진수는 0을 붙임
		int octa = 064;
		System.out.println("8진수 064의 값은 : " + octa);
		
		//16진수 0x를 붙임
		int hexa = 0x3a4c;
		System.out.println("16진수 0x3a4c의 값은 : " + hexa);
		
		System.out.println("----------------------------");
		
		float f1 = 3.14f;
		double d1 = 3.14;
		
		//e표기법, 참고용
		double d2 = 314e-2;
		double d3 = 0.0314e2;
		System.out.println("314e-2의 값은 " + d2);
		System.out.println("0.0314e2의 값은 " + d3);
		
		System.out.println("----------------------------");
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println("bool1 = " +bool1 + ", bool2 = "+ bool2);
		
	}
}
