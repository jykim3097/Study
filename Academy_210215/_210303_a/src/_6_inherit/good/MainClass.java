package _6_inherit.good;

public class MainClass {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "홍길동";
		p.age = 20;
		System.out.println(p.info());
		
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
	}
}
