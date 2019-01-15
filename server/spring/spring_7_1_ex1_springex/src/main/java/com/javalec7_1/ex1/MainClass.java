package com.javalec7_1.ex1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//컨테이너 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		//컨테이너 설정
		ctx.load("classpath:applicationCTX.xml");
		ctx.refresh();
		
		//컨테이너 사용
		Student student = ctx.getBean("student", Student.class);
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
		
		//컨테이너 종료
		ctx.close();
	}

}
