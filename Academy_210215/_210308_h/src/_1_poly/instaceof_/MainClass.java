package _1_poly.instaceof_;

public class MainClass {

	public static void main(String[] args) {
		
		//배열에 다형성 적용
		//부모타입에 자식들을 담아서 한 번에 자료 관리를 할 수 있다.
		Person hong = new Student("홍길동", 29, "123");
		Person choi = new Teacher("최강창민", 30, "가수");
		Person son = new Employee("손흥민", 20, "축구");
		
		personInfo(hong);
		System.out.println();
		personInfo(choi);
		System.out.println();
		personInfo(son);
	}
	
	public static void personInfo(Person p) {
		
		//instanceof로 타입 확인 후 캐스팅
		if(p instanceof Student) {
			
			System.out.println("***학생 정보입니다");
		
			Student s = (Student) p;
			System.out.println(s.info());
		
		} else if (p instanceof Teacher) {

			System.out.println("***선생님 정보입니다");

			Teacher t = (Teacher) p;
			System.out.println(t.info());

		} else if (p instanceof Employee) {
			
			System.out.println("***직원 정보입니다");

			Employee e = (Employee) p;
			System.out.println(e.info());
		
		} else { //person - 부모타입은 항상 마지막에 

			System.out.println("***학생 정보입니다");

			System.out.println("사람 정보입니다.");
			System.out.println(p.info());
		}
	}
}
