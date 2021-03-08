package _1_poly.basic3;

public class Student extends Person {

	String studentId;

	Student(String name, int age, String studentId){
		super(name, age); //부모님 클래스에 name, age를 받아주는 생성자가 있을 거다!
		//this.name = name;
		//this.age = age;
		this.studentId = studentId;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
}
