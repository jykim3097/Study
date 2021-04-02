package _210302_h;

public class _5_CalculatorMain {
	//_5_ObjectBasic02
	public static void main(String[] args) {
		
		//클래스를 이용하는 방법
		_4_Calculator cal1 = new _4_Calculator();
		
		System.out.println("1번 계산기로 계산");
		System.out.println( cal1.add(1) );
		System.out.println( cal1.add(2) );
		System.out.println( cal1.add(3) );
		
		_4_Calculator cal2 = new _4_Calculator();
		
		System.out.println("2번 계산기로 계산");
		System.out.println( cal2.add(10) );
		System.out.println( cal2.add(20) );
		System.out.println( cal2.add(30) );
		
	}
}
