package _1_api.lang.wrap;

public class BoxingUnboxing {

	public static void main(String[] args) {
		
		//Wrapper 클래스는 기본형의 객체타입을 의미한다.
		int a = 100;
		double b = 3.14;
		char c = 'A';
		boolean d = true;
		
		//boxing - 기본타입을 객체타입(클래스)로 변환하는 작업
		Integer var1 = new Integer(a);
		Double var2 = new Double(b);
		Character var3 = new Character(c);
		Boolean var4 = new Boolean(d); // ....
		
		//Unboxing - 객체 타입을 기본타입으로 변환하는 작업
		int r1 = var1.intValue();
		double r2 = var2.doubleValue();
		char r3 = var3.charValue();
		
		//AutoBoxing - 1.8버전에서부터 자동으로 형변환을 제공(AutoBoxing을 쓰도록 권고)
		Integer i1 = 100; //int랑은 다른 것
		Double i2 = 3.14;
		
		int v1 = i1;
		double v2 = i2;
		
		//문자열이 아니라 값이 나옴
		System.out.println(i1);
		System.out.println(i2);
		
		//AutoBoxing 이후에 wrapper 클래스들은 문자열을 기본형으로 변환하는 데 많이 사용된다.
		int a1 = Integer.parseInt("100"); //외워~
		double a2 = Double.parseDouble("3.14"); //외워~
		long a3 = Long.parseLong("1000");
		
		System.out.println(a1+a2+a3);
	}
}
