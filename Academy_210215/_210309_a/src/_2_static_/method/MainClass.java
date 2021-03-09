package _2_static_.method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Count c = new Count();
		c.a = 10;
		
		c.method01();
		Count.b++;
		
		//static 메서드의 사용
		Count.method02();
		System.out.println(Count.b);
		
		MainClass t = new MainClass();
		t.test();
		
		//왜 static이 중요할까?
		Math.random();

		//생성자가 private이라 객체를 생성할 수 없다.
		//대신 다 static으로 만들어놨기 때문에 그냥 점 찍고 쓰면 된다.
		//Math m = new Math(); 
		
		System.out.println(Math.abs(-5));
		System.out.println(Arrays.toString(new int[10]));
		System.out.println(Integer.parseInt("10"));
		
		//위와 같이 생긴 애들은 다 static 메서드! 
		
	}
	
	public void test() {}
}
