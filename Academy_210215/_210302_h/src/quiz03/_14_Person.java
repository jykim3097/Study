package quiz03;

public class _14_Person {
	
	String name;
	int age;
	int tall;
	
	//생성자를 생성하면 컴퓨터가 기본생성자를 자동으로 만들지 않는다.
	_14_Person(){}
	
	_14_Person(String pName, int pAge, int pTall) {
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age+"세");
		System.out.println("키: "+tall);
	}
}
