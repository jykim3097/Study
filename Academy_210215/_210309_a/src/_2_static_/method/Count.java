package _2_static_.method;

public class Count {

	public int a; //일반 변수는 객체를 생성할 때 만들어지고
	public static int b; //정적 멤버 변수, static은 클래스가 생성될 때 다 만들어진다.
	
	//일반메서드 - 일반 멤버 변수, 정적 멤버 변수 모두 사용 가능
	public int method01() {
		a=10;
		return b++; 
	}
	
	//정적메서드 - static이 붙은 변수나 메서드만 사용이 가능
	public static int method02() { //static 방법으로 호출한다.
		//a = 10;
		//a를 쓸 수 있는 방법이 없을까? - 객체를 생성해서 쓰면 됨
		
		Count c = new Count();
		c.a = 10;
		System.out.println("c.a =  " + c.a);
		
		return b++;
	}
	
	
}
