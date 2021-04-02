package _4_this.basic;

public class Student extends Person {

	String studentId;

	Student(String name, int age, String studentId){
		super(); //생략된 것
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
}
