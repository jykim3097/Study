package _1_quiz11_t;

public class MyCart {

	private int money; //가진 돈
	private Product[] cart = new Product[1]; //상품을 저장할 배열, 멤버변수
	private int i= 0;
	
	MyCart(int money){
		this.money = money;
	}

	public void buy(Product p) {
		
		if(this.money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		} else {
			this.money -= p.price;
			add(p);
		}
	}

	private void add(Product p) {
		
		
		if( i >= cart.length) { //장바구니가 가득 찬 경우
			Product[] nc = new Product[cart.length*2];
			
			for(int j=0; j< cart.length; j++) {
				nc[j] = cart[j];
			}
			
			// 주소를 옯겨준다! ***감동적...
			// 이걸 생각 못해서 코드가 엄청 복잡해졌다
			cart = nc;
		} 
		cart[i] = p;
		i++;
		
		info();
	}

	public void info() {
		
		int sum=0;
		
		System.out.print("현재상품 : [");
		for(int index=0; index<i; index++) {
//			if( cart[index] instanceof Computer ) {
//				System.out.print(cart[index].name + " ");
//			} else if ( cart[index] instanceof Tv ) {
//				System.out.print(cart[index].name + " ");
//			} else if ( cart[index] instanceof Radio) {
//				System.out.print(cart[index].name + " ");
//			}
			
			sum += cart[index].price; // 금액 누적
			System.out.print(cart[index].name + " ");
		}
		System.out.print("]");
		
		System.out.println("\n잔액: " + money);
		System.out.println("총액: " + sum + "\n");
	}
}
