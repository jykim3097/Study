package _1_api.lang.sb;

public class MathEx {

	public static void main(String[] args) {
		
		//Math는 전부 static메서드, 클래스.이름 으로 빠르게 접근
		
		double d = Math.random();
		System.out.println(d);
		
		double d2 = Math.ceil(1.1); //올림
		System.out.println(d2);
		
		double d3 = Math.floor(1.2); //내림
		System.out.println(d3);
		
		double d4 = Math.round(1.7); //반올림
		System.out.println(d4);
		
		int max = Math.max(1, 3);
		System.out.println("큰수: " + max);
	}
}
