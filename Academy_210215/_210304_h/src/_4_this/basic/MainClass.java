package _4_this.basic;

public class MainClass {
	public static void main(String[] args) {
		
		//클래스도 타입이다.
		Person p = new Person("홍길동", 20);
		//System.out.println(p); //나 자신(의 위치정보)
		System.out.println(p.info());
		
		Person p2 = new Person("김길동");
		System.out.println(p2.info());
		
		Person p3 = new Person();
		System.out.println(p3.info());
		
		Student s = new Student("정길동", 20, "21212");
		System.out.println(s.info());
		
		Employee e = new Employee("박길동", 20, "약사");
		System.out.println(e.info());
		
		Teacher t = new Teacher("백길동", 20, "국어");
		System.out.println(t.info());
	}
}
