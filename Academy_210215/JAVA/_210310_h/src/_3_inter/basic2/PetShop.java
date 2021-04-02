package _3_inter.basic2;

public class PetShop {

	//1. carePet() 메서드 선언
	//   매개변수는 모든 펫 타입을 전달 받을 수 있도록 선언
	//   기능 - instanceof를 사용해서 캐스팅하고, "xxx를 돌봅니다" 출력


	public void carePet(IPet pets) {

		if (pets instanceof Dog) {
			Dog dog = (Dog)pets;
			System.out.println("강아지를 돌봅니다.");
		} else if (pets instanceof Cat) {
			Cat cat = (Cat)pets;
			System.out.println("고양이를 돌봅니다.");
		} else if (pets instanceof GoldFish) {
			GoldFish fish = (GoldFish) pets;
			System.out.println("물고기를 돌봅니다.");
		}
	}

	//2. petInfo() 메서드 
	//   매개변수는 펫 배열을 받도록 선언
	//   기능 - 모든 펫의 play 메서드 실행
	public void petInfo(IPet[] pArr) {

		for(IPet p : pArr) {
			p.play();
		}
	}
}
