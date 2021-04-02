package _2_encap.good;

public class MyBirth {

	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉 변수에 접근할 때는 클래스 설계자가 미리 생성해놓은
	 * getter와 setter 메서드를 사용한다.
	 * 
	 * setter 메서드
	 * 1. 은닉변수의 값을 저장하는 용도
	 * 2. 접근제한자는 public으로 선언, 이름은 (set + 멤버변수명)으로 지정
	 * 
	 * getter 메서드
	 * 1. 은닉변수의 값을 조회하는 용도
	 * 2. 접근제어자는 public으로 선언하고 이름은 (get + 멤버면수명)으로 지정
	 * 
	 */
	
	// setter 메서드는 저장용이기 때문에 반환형이 없어도 됨
	public void setYear(int year) {
		
		/*
		 * 예시
		 * year를 1950 ~ 2021까지 저장하도록 설정하세요
		 * 
		 * 이렇게 검증하는 과정을 거칠 수 있다.
		 */
		
		 if(year <= 1950 || year > 2021) {
			 System.out.println("1950년 ~ 2021년 사이의 값을 입력하세요");
		 } else {			 
			 this.year = year;
		 }
	}
	
	//특정 값이 있어야만 get할 수 있습니다 라고 하고 싶으면 매개변수가 있을 수도 있다.
	public int getYear() {
		return year;
	}
	
	/*
	 * 1. month, day, ssn에 getter, setter를 생성
	 * 2. month - 1~12월까지 저장
	 * 3. day - 1~31일까지 저장
	 * 4. ssn - 13자리까지만 저장 .length();
	 */
	
	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			System.out.println("1월 ~ 12월 사이의 값을 입력해주세요");
		} else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		
		if(day < 1 || day > 31) {
			System.out.println("1일 ~ 31일 사이의 값을 입력해주세요");
		} else {
			this.day = day;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setSsn(String ssn) {
		
		if(ssn.length() != 13) {
			System.out.println("'-'를 제외하고 13자리 이하로 입력해주세요");
		} else {
			this.ssn = ssn;
		}
	}
	
	public String getSsn() {
		return ssn;
	}
}
