package _2_static_.singleton;

public class MainClass {

	public static void main(String[] args) {

		//싱글톤의 호출
		Singleton s1 = Singleton.getInstatnce();
		Singleton s2 = Singleton.getInstatnce();
		System.out.println(s1 == s2);
	
		s1.setS("이순신"); //값의 변경
		System.out.println(s2.getS());
		
		
	}
}
