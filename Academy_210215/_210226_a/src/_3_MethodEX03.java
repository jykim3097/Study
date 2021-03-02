
public class _3_MethodEX03 {

	public static void main(String[] args) {
		/*
		 * 반환유형(return type)
		 * 1. 반환유형은 메서드가 실행한 결과를 돌려주는 값에 대한 type
		 * 2. 반환유형이 있는 메서드는 호출구문이 하나의 값이 되기 때문에 다른 메서드의 매개값으로도 사용된다.
		 * ex) print(메서드호출);
		 * 
		 * 3. 반환이 없는 메서드는 void를 붙인다.
		 * 4. 모든 메서드는 return 키워드를 만나면 강제종료된다.
		 *    그래서 void형 메서드에도 return 키워드 사용이 가능하고,
		 *    return 아래에는 코드 작성이 불가
		 */
		int result = add( add(1,2), add(2,3));
		System.out.println("결과 : " + result);
		
		sub(1,2);
		
		multi();
		
		noReturn("똑똑이");
	}
	
	static int add(int a, int b) {
		return a+b;
	}
	
	//반환이 없는 메서드
	static void sub(int a, int b) {
		System.out.println("두 수의 차 : "+ (a-b));
	}
	
	//반환과 매개변수가 없는 메서드
	static void multi() {
		System.out.println(3*5);
	}
	
	//강제 종료의 의미를 가진 return
	static void noReturn(String name) {
		
		if(name.equals("똑똑이")) {
			System.out.println("참 잘했어요");
			return; //메서드의 종료
		} 
		
		System.out.println("틀렸습니다. 독똑이를 입력하세요.");			

		
		
	}
	
	
	
}
