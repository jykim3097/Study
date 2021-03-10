package _1_quiz12;

public class MainClass {

	public static void main(String[] args) {
		
		Shape c1 = new Circle("원", 5);
		System.out.println("도형 이름 : " + c1.getName());
		System.out.println(c1.getName() + "의 넓이 : " + c1.getArea());
		
		System.out.println();
		
		Shape r = new Rect("정사각형", 5);
		System.out.println("도형 이름 : " + r.getName());
		System.out.println(r.getName() + "의 넓이 : " + r.getArea());
	}
}
