package _2_static_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 1. 계산기 2개를 만들고 각각 색상을 지정
		 * 2. 계산기 색상을 확인하세요
		 * 3. result 값을 반환받는 getResult() 생성
		 * 4. pi와 circle()를 이용해 원의 넚이를 구하세요
		 */
		
		//두 계산기는 다르지만 pi는 똑같다. pi는 static으로 선언되었으니까
		Calculator c1 = new Calculator();
		c1.setColor("blue");
		System.out.println("c1 계산기 색깔: " + c1.getColor());
		
		Calculator c2 = new Calculator();
		c2.setColor("yellow");
		System.out.println("c2 계산기 색깔: " + c2.getColor());
				
		c1.add(5);
		c1.add(17);
		System.out.println("c1 계산기 결과: " + c1.getResult());
		
		System.out.println("원의 넓이: " + Calculator.pi * 4 * 4);
		System.out.println("원의 넓이: " + Calculator.areaCircle(5));
		
		int[] iArr = {1,2,3,4,5};
		System.out.println(ArrayPrint.printArray(iArr));
	}
}
