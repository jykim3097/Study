package _3_generic.good;

public class ABC<T> { //<>가 붙은 제네릭 클래스 (T는 미정)

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
