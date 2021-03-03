package _1_quiz02;

public class _4_StudentMain {
	public static void main(String[] args) {
		
		_3_Student student1 = new _3_Student("김지영", 1, 90, 95, 100);
		
		student1.info();
		System.out.println(student1.getTotal());
		System.out.println(student1.getAvg());
		
		_3_Student student2 = new _3_Student("홍길동", 2, 91, 96, 99);
		
		student2.info();
		System.out.println(student2.getTotal());
		System.out.println(student2.getAvg());
	}
}
