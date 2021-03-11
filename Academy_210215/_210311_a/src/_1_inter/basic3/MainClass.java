package _1_inter.basic3;

public class MainClass {

	public static Printed p;
	public static CompanyA a;
	
	public static void main(String[] args) {
		
		p = new CompanyA();
		//p = new CompanyB();
		
		p.turnOn();
		p.print("가나다");
		p.colorPrint("마바사", "red");
		p.copy(5);
		p.turnOff();
		
		a = new CompanyA();
		a.print("happy"); //객체 생성을 안하면 널포인트에러가 뜬다
	}
}
