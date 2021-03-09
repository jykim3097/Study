package _3_final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("123123", "김길동");
		//p1.nation = "미국";
		//p1.name = "정길동";
		
		System.out.println("국적: " + p1.nation);
		
		Person p2 = new Person("123", "홍길동");
		
		System.out.println(p1.ssn);
		System.out.println(p2.ssn);
	}
}
