package _3_generic.good;

public class MainClass {

	public static void main(String[] args) {

		/*
		 *  제네릭을 사용하면 객체를 생성할 때 사용할 타입을 지정할 수 있고
		 *  다양한 값을 저장하도록 생성해서 사용이 가능하다.
		 */
		
		ABC<String> abc = new ABC<String>();
		abc.setT("홍길동"); //저장
		String name = abc.getT(); //사용
				
		ABC<DEF> abc2 = new ABC<>(); //뒤에는 생성자 타입 생략가능
		abc2.setT(new DEF());
		DEF def = abc2.getT();
		
		//기본형을 저장할 수 없기 때문에 Wrapper 타입 클래스를 넣어라
		//ABC<int> abc3 = new ABC<>();
		ABC<Integer> abc3 = new ABC<>();
	}
}
