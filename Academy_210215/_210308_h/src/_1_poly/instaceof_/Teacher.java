package _1_poly.instaceof_;

public class Teacher extends Person {

	String subject;
	
	Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}

	String info() {
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}
}
