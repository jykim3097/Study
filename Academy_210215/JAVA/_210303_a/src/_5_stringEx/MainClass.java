package _5_stringEx;

public class MainClass {
	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3); //false, 주소가 다르다
		
		/*
		 * 한 클래스에서 문자열을 똑같이 선언하면 같은 String을 가르키게 된다.
		 * 하지만 직접 String 객체를 생성하거나, 다른 클래스의 String은 다른 주소를 갖는다.
		 * 
		 * 그래서 문자열을 비교할 때 '==' 대신에 String클래스가 제공하는 equals() 메서드를 사용해야 한다.
		 */

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3)); //true, 값이 같다
		
		if(str1.equals("홍길동")) {
			System.out.println("문자열 값이 같음");
		}
	}
}
