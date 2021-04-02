package _4_ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * Say01은 인터페이스니까 객체를 만들 수 없다.
		 * 그러면 구현 클래스를 만들어야된다.
		 * 근데 한 번만 쓰기 위해 구현 클래스를 하나하나 다 만드는 건
		 * 파일이 낭비가 될 수 있기 때문에 익명 객체를 만들어 
		 * 간단하게 표현할 수 있다.
		 */
		
		
		//Person greeting 메서드를 어떤 방법으로든 실행		

//		Say01 hi = new Say01() {
//			
//			@Override
//			public void talking() {
//				System.out.println("hi");
//			}
//		};
//		
//		Person p = new Person();
//		p.greeting(hi);
		
		
		Person p = new Person();
		p.greeting(new Say01() {

			@Override
			public void talking() {
				System.out.println("hello");
			}
		});
		
		p.greeting(new Say02() {

			@Override
			public String talking() {
				return "hi";
			}
			
		});
		
		p.greeting(new Say03() {

			@Override
			public String talking(String word) {
				return word + "홍길동입니다.";
			}
		});
		
		String r = p.greeting(new Say04() {
			
			@Override
			public String greeting(String word, int i) {
				
				//3번 인사하는 기능
				String result = "";
				for(int j=0; j<i; j++) {
					result += word;
				}
				return result;
			}
		});
		System.out.println(r);
		
		System.out.println();
		
		//함수적 인터페이스를 매개변수로 받는 형식은 람다로 표현할 수 있다.
		//요즘 언어는 다 이런 식이다..
		p.greeting( () -> System.out.println("hello")); //1줄 표현은 중괄호 생략 가능
		p.greeting( () -> {return "hi";}); //1줄이면 리턴값만 적는다, 중괄호 생략 사능
		p.greeting( (word) -> word + "홍길동입니다" ); // 매개변수는 변수명만 적는다
		String r2 = p.greeting((word, i) -> {
			String result = "";
			for(int j=0; j<i; j++) {
				result += word;
			}
			return result;
		});
		System.out.println(r2);
	}
}
