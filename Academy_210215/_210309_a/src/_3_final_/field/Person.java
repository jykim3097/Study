package _3_final_.field;

public class Person {
	
	/*
	 * final 변수는 값이 대입되면 변경할 수 없기 때문에 반드시 초기화를 해야한다.
	 * 1. 직접초기화 - 만들자마자 고정
	 * 2. 생성자를 통한 초기화 - 객체마다 다른 값을 가질 수  있다.
	 * 
	 */

	public final String nation = "대한민국"; //직접초기화
	
	public String ssn;
	public final String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
