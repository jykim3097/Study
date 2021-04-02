package _1_poly.basic3;

public class House {

	//다형성이 없다면 이렇게 생성해줘야함
//	Student[] arr;
//	Employee[] arr2;
//	Teacher[] arr3;
	
//  접근제한자  타입           멤버변수
	private Person[] arr; //자식클래스(자료)를 저장할 배열
	private int idx; //배열을 관리할 index
	
	House() {
		arr = new Person[100];
	}

	/*
	 * 1. Person의 자식 객체를 전달 받을 수 있는 setIn() 생성하세요
	 * 1-1. 기능 : Person 배열에 순서대로 자식클래스를 저장하세요
	 * 2. info()는 arr에 있는 학생정보를 전부 출력해주는 메서드
	 * 3. 메인클래스에서 6명의 Person을 전달하고 info메서드로 확인하세요
	 */

	public void setIn(Person p) {
		arr[idx] = p;
		idx++;
	}	
	
	public void info() {
		for(int i=0; i<idx; i++) {
			System.out.println(arr[i].info());
		}
	}
}
