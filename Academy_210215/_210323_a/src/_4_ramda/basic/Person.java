package _4_ramda.basic;

public class Person {

	//인사
	public void greeting(Say01 say) {
		say.talking();
	}
	
	//overloading
	//Say02의 talking은 반환이 있 기능
	public void greeting(Say02 say) {
		String word = say.talking();
		System.out.println(word);
	}
	
	//Say03의 taliking은 매개변수와 반환이 있는 유형
	public void greeting(Say03 say) {
		String result = say.talking("안녕하세요, ");
		System.out.println(result);
	}
	
	public String greeting(Say04 say) {
		String result = say.greeting("Hi", 3);
		return result;
	}
}
