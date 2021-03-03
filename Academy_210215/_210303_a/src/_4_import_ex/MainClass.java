package _4_import_ex;

import java.util.Scanner;

import _2_fruit.*;
import _3_com.abc.ABC;
import _3_com.def.DEF;

public class MainClass {
	public static void main(String[] args) {
		
		_5_Apple a = new _5_Apple();
		_6_Orange o = new _6_Orange();
		
		ABC abc = new ABC();
		DEF def = new DEF();
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 기본 타입 : 정수, 실수, 문자, 논리 값을 저장하는 데이터 타입
		 * 		       실제 값을 변수에 저장, 스택에 변수 저장
		 * 참조 타입 : 객체의 주소를 참조하는 타입, 배열, 클래스, 인터페이스 타입
		 *         메모리의 주소값을 변수에 저장
		 *         참조타입으로 선언된 변수는 스택 영역에 주소값을 저장하고, 실제 값은 힙에 저장한다.
		 */
		int i = 1;
		System.out.println("기본 타입 : " +i);
		System.out.println("참조 타입 : " + a);
		System.out.println("참조 타입 : " + o);
	}
}
