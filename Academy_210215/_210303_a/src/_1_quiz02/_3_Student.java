package _1_quiz02;

public class _3_Student {

	/*
	 * 멤버변수
	 * name, no, kor, eng, math
	 * 생성자 : 5개를 매개변수로 받아서 초기화하는 생성자
	 * 메서드1 : getTotal() - 국, 영, 수 점수를 모두 더해서 double형으로 반환
	 * 메서드2 : getAvg() - 평균을 double형으로 반환(소수점 2자리수까지)
	 */
	
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	_3_Student(String pName, int pNo, int pKor, int pEng, int pMath) {
		name = pName;
		no = pNo;
		kor = pKor;
		eng = pEng;
		math = pMath;
	}
	
	double getTotal() {
		return kor+eng+math;
	}
	
	double getAvg() {
		return (int)(getTotal()/3 * 100) /100.0;
	}
	
	void info() {
		System.out.println("===== 학생 정보 =====");
		System.out.println("이름: " + name);
		System.out.println("학번: " + no);
	}
}
