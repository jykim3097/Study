package _6_super.basic;

public class Person {

	String name;
	int age;
	
	Person (String name, int age) {
		this.name = name;
		this.age = age;
		//System.out.println(this); // 나 자신(의 위치정보)
		//System.out.println(this.info());
		System.out.println(info()); // 가장 가까운 게 아래 info()니까 그냥 써도 무방함
		System.out.print("o");
	}	
	
	Person(String name){
//		this.name = name;
//		this.age = 1;
		this(name, 1);
		System.out.print("s");
	}
	
	Person(){
//		this.name = "이름 없음";
//		this.age = 1;
		this("이름 없음", 1); //직접 생성자를 연결한 경우이기 때문에 이 생성자에는 super()가 없다.
		System.out.print("t");
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
}
