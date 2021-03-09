package _5_abs.bad;

public class ParentStore {

	//만약에 추상클래스를 사용하지 않는다면?
	public void apple() {
		System.out.println("사과의 가격은 지점에서 각각 결정하세요");
	}
	
	public void grape() {
		System.out.println("포도의 가격은 지점에서 각각 결정하세요");
	}
	
	public void orange() {
		System.out.println("오렌지의 가격은 지점에서 각각 결정하세요");
	}
}
