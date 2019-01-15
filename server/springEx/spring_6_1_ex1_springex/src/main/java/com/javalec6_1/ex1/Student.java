package com.javalec6_1.ex1;

import java.util.ArrayList;

public class Student {
	//학생 정보 관리
	
	private String name;
	private int age;
	private ArrayList<String> hobbys;
	private double height;
	private double weight;
	
	//config 파일에서 constructor-arg로 설정
	public Student(String name, int age, ArrayList<String> hobbys) {
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}

	//property로 설정
	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public ArrayList<String> getHobbys() {
		return hobbys;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
	
	
}
