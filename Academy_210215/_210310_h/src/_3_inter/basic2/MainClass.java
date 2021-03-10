package _3_inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat =  new Cat();
		Animal tiger =  new Tiger();
		
		//1. Animal[]을 생성해 저장하고, 향상된 for문으로 동물의 기능 출력
		Animal[] aArr = {dog, cat, tiger};
		for(Animal a : aArr) {
			a.eat();
		}
		
		System.out.println();
		
		//2. IPet[]을 생성 후 강아지, 고양이, 금붕어를 저장, 
		//   향상된 for문으로 펫의 기능 출력
		//   IPet과 Animal은 서로 다른 타입이지만, 자식 클래스가 상호연관성을 가지면 형변환이 된다.
		GoldFish fish = new GoldFish();
		IPet[] pArr = {(IPet) dog, (IPet) cat, (IPet) fish};
		for(IPet i : pArr) {
			i.play();
		}
		
		System.out.println();
		
		PetShop shop = new PetShop();
		shop.carePet(new Dog());
		shop.carePet(new Cat());
		shop.carePet(new GoldFish());
		
		System.out.println();
		
		shop.petInfo(pArr);
	}
}
