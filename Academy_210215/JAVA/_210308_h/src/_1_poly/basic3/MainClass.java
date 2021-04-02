package _1_poly.basic3;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
//		//다형성이 없다면?
//		Student hong = new Student("홍길동", 29, "123");
//		Student park = new Student("박찬호", 25, "234");
//		Student kim = new Student("김밥나라", 30, "345");
//		
//		Teacher lee = new Teacher("이승철", 40, "가수");
//		Teacher choi = new Teacher("최강차민", 30, "가수");
//		
//		Employee son = new Employee("손흥민", 20, "축구");
//		
//		//정보를 저장하기 위해 각각의 배열이 필요하다.
//		Student[] arr1 = {hong, park, kim};
//		Teacher[] arr2 = {lee, choi};
//		Employee[] arr3 = {son};
//		
//		for(Student s : arr1) {
//			System.out.println(s.info());
//		}
		
		//배열에 다형성 적용
		//부모타입에 자식들을 담아서 한 번에 자료 관리를 할 수 있다.
		Person hong = new Student("홍길동", 29, "123");
		Person park = new Student("박찬호", 25, "234");
		Person kim = new Student("김밥나라", 30, "345");
		
		Person lee = new Teacher("이승철", 40, "가수");
		Person choi = new Teacher("최강창민", 30, "가수");
		
		Person son = new Employee("손흥민", 20, "축구");
		
		Person[] arr = {hong, park, kim, lee, choi, son};
		
		for(Person p : arr) {
			System.out.println(p.info());
		}
		
		System.out.println("-------------------------");
		
		//매개변수 다형성
		House h = new House();
		
		h.setIn(hong);
		h.setIn(park);
		h.setIn(kim);
		h.setIn(lee);
		h.setIn(choi);
		h.info();
	}
}
