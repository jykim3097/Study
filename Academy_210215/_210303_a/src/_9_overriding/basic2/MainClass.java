package _9_overriding.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		//클래스도 타입이다.
		Person p = new Person();
		p.name = "홍길동";
		p.age = 20;
		System.out.println(p.info());
		
		System.out.println();
		
		Student s = new Student();
		s.name = "김지영";
		s.age = 28;
		s.studentId = "123";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.name ="정현채";
		t.age = 29;
		t.subject = "지리";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.name ="김준영";
		e.age = 26;
		e.department = "사서";
		System.out.println(e.info());
	}
}
