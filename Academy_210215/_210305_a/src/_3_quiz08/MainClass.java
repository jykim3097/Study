package _3_quiz08;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		//문제1
		User user = new User("홍길동", 123123, 20);
		System.out.print(user.getName()+", ");
		System.out.print(user.getRrn()+", ");
		System.out.println(user.getAge());
		
		System.out.println("--------------------");

		//문제2
		User[] uArr = new User[2];
//		User user2 = new User("김길동", 456456, 30);
		User user2 = new User();
		user2.setName("김길동");
		user2.setRrn(456456);
		user2.setAge(30);
		
		uArr[0] = user;
		uArr[1] = user2;
		
		for(User u : uArr) {
			System.out.print(u.getName()+", ");
			System.out.print(u.getRrn()+", ");
			System.out.println(u.getAge());
		}
		
		System.out.println("--------------------");

		//문제3
		User[] uArr2 = new User[5];
		
		int i=0;
		while(i<5) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름> ");
			String name = scan.next();
			System.out.print("번호> ");
			int rrn = scan.nextInt();
			System.out.print("나이> ");
			int age = scan.nextInt();
			
			User u = new User(name, rrn, age);
			uArr2[i] = u;
			
			i++;
		}
		
		System.out.println(Arrays.toString(uArr2));
	}
}
