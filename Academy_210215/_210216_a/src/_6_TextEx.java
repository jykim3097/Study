
public class _6_TextEx {

	public static void main(String[] args) {
		//Day01
		//단일문자를 저장하는 데이터타입 char
		char c1 = 'A';
		char c2 = 65; 
		
		System.out.println("c1 = " + c1 + ", c2 = " + c2);

		// java가 유니코드를 쓰고 있기 때문에 문자가 숫자로 저장된다
		// 문자를 통일하기 위ㅐ 유니코드가 등장했고,
		// 크기를 2byte로 지정해, 부호 없는 형태의 65536개의 글자를 표현한다
		
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00'; //유니코드를 표현하는 탈출문자
		
		System.out.println("c3 = " + c3 + ", c4 = " + c4 + ", c5 = " + c5 );
		System.out.println(c3 + c4 + c5); // 연산의 우선순위에 따라 숫자로 연산이 됨
		System.out.println(c3 + "" + c4 + "" + c5); // 중간에 문자열을 넣어주면 '가가가'로 나옴
		
		System.out.println("----------------------------");

		//String 문자열 저장
		String s1 = "Hello ";
		String s2 = "World";
		System.out.println(s1 + s2);
		System.out.println("s1의 길이는 " + s1.length());
		
		System.out.println("----------------------------");

		// 문자열의 덧셈 (+) -> 문자열이 가장 강한 타입
		// 문자열이 다른 타입이랑 붙으면 결과는 항상 문자열
		System.out.println(100 +200); // 숫자 + 숫자 = 숫자
		System.out.println("100"+200); // 문자 + 숫자 = 문자열
		System.out.println(100 + 200 + "hello"); //300hello
		System.out.println("hello" + 100 + 200); //hello100200

		System.out.println("----------------------------");
		System.out.println('A' + 10); // 75, char + int = int
		System.out.println("A" + 10); // A10
	}
}
