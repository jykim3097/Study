
public class _1_CastingEx03 {
	//서로 다른 타입의 연산
	public static void main(String[] args) {
		//Day02
		//1. 큰 타입에 맞춰 형변환
		char c = 'A';
		int i = 2;
		
		//char cc = (char) 
		//c + i; 연산 우선순위에 따라 c만 캐스팅 되는 거기 때문에 결국 똑같은 결과이다.
		char cc =  (char) (c + i);
		System.out.println("cc의 값은 " + cc);
		
		//1-1. int보다 작은 변수끼리 연산 - 결과는 무조건 int!
		byte b1 = 100;
		byte b2 = 12;
		
		byte b3 = (byte)(b1 + b2);
		
		byte b4 = 10;
		short s1 = 100;
		
		short ss = (short) (b4 + s1);
		
		//2. int보다 큰 변수와의 연산 - 큰 타입에 맞춰 자동형변환
		int j = 10;
		double d = 3.14;
		
		double dd = j + d;
		System.out.println("dd의 값은 " + dd);
		
	}
}
