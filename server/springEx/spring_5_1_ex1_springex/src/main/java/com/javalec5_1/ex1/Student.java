package com.javalec5_1.ex1;

public class Student {
	
	private String name;
	private String age;
	private String gradeNum;
	private String classNum;
	
	//생성자를 통해 필드를 초기화하는 방법
	//디폴트 생성자는 없고, 파라미터를 받고 있음
	//받은 파라미터를 가지고 필드를 초기화 시켜준다.
	public Student(String name, String age, String gradeNum, String classNum) {
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
		this.classNum = classNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGradeNum() {
		return gradeNum;
	}

	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}

	public String getClassNum() {
		return classNum;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	
	
}
