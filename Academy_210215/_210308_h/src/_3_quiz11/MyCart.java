package _3_quiz11;

public class MyCart {

	// 1. 모든 멤버변수와 메서드에 적절한 접근제한자를 선언하세요
	private int money; //가진 돈
	private Product[] cart; //상품을 저장할 배열, 멤버변수
	private int i;
	
	//2. MyCart생성자는 money만 받아서 초기화
	MyCart(int money){
		this.money = money;
		cart = new Product[1];
		i = 0;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setCart(Product[] cart) {
		this.cart = cart;
	}
	
	public Product[] getCart() {
		return cart;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public int getI() {
		return i;
	}
	
	/*
	 * 3. buy()는 모든 상품을 받도록 선언
	 * 가진 돈과 전달된 물건의 가격을 비교해서 가진 돈이 적으면 "금액 부족" 출력 후 종료
	 * 가진 돈이 충분하면 물건의 가격을 money에서 빼고 add(상품) 메서드 호출
	 */
	public void buy(Product p) {
		
		if(getMoney() < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		} else {
			setMoney(getMoney() - p.price);
			add(p);
			setI(++i);
		}
	}
	
	/*
	 * 4. add()는 모든 상품을 받도록 선언
	 * 
	 * 만약 i의 값이 cart의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 *2배 큰 배열을 생성
	 * 
	 * 기존 cart의 값을 새로운 배열에 복사
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * info() 메서드를 호출한다.
	 */
	public void add(Product p) {
		
		
		if(getI() >= getCart().length) {
			Product[] nc = new Product[2*getCart().length];
			
			for(int j=0; j<getCart().length; j++) {
				nc[j] = getCart()[j];
			}
			nc[getI()] = p;
			setCart(nc);
			
			info(getCart());
		} else {
			getCart()[getI()] = p;
			
			info(getCart());
		}
	}
	
	/*
	 * 5. info()
	 * cart 안에 담긴 물건의 물건의 이름을 출력한다.
	 * cart 안에 담긴 물건의 가격을 모두 더해서 출력
	 * 남은 금액 출력
	 * 
	 * main에서는 buy() 메서드만 호출하면 된다.
	 */
	public void info(Product[] cart) {
		int sum=0;
		
		for(int i=0; i<getI()+1; i++) {
			
			if(i == getI()) {
				System.out.println(cart[i].name + "를 구매했습니다.");
				sum += cart[i].price;
			} else {
				System.out.print(cart[i].name + "와 ");
				sum += cart[i].price;
			}
		}
		System.out.println("총액: " + sum);
		System.out.println("잔액: " + getMoney() + "\n");
	}
}
