package _2_quiz04;

public class MainClass {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.r = 5;
		cal.result = 2;
		cal.pi = 3.14;

		System.out.println(cal.result+" X "+ cal.r + " = " + cal.multi(cal.r));
		System.out.println(cal.result + " / " + cal.r + " = " + cal.div(cal.r));
		System.out.println("반지름이 " + cal.r + "인 원의 넓이는 " + cal.circle(cal.r));
		
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("반지름이 " + cal.r + "인 원의 넓이는 " + com.circle(cal.r));
		System.out.println("한 변의 길이가 3인 정사각형의 넓이는 " + com.rect(3));
		System.out.println("한 변의 길이가 3이고 다른 한 변의 길이가 4인 직사각형의 넓이는 " + com.rect(3, 4));
		System.out.println("한 변의 길이가 3이고 다른 한 변의 길이가 4, 높이가 5인 직육면체의 넓이는 " + com.rect(3,4,5));
	}
}
