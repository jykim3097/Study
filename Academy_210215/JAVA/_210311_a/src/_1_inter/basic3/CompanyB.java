package _1_inter.basic3;

public class CompanyB implements Printed {

	private String logo = "Life is happy";
	
	@Override
	public void turnOn() {
		System.out.println(logo);
		System.out.println("전원을 켭니다. \n");
	}

	@Override
	public void turnOff() {
		System.out.println();
		System.out.println(logo);
		System.out.println("전원을 끕니다.");
	}

	@Override
	public void print(String document) {
		System.out.println(document);
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println(document);
		System.out.println("지정색 : " + color);
	}

	@Override
	public void copy(int a) {
		
		for(int i=1; i<=a; i++) {			
			System.out.println(i + "장 복사합니다.");
		}
	}

}
