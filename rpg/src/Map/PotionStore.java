package Map;

public class PotionStore extends Map{
	int powerPotion = 100;
	int defensePotion = 100;
	int experiencePotion = 300;
	int hpPotion = 10;
	int mpPotion = 10;
	
	public int show (int money, int number) { //포션 상점 구매에 대한 처리 돈이 있다면 구매 없다면 불가능
		name = "포션 상점";
		System.out.println(name+"에서 물건을 구매 시도하는 중입니다.");
		if(number == 1 && powerPotion <= money) {
			return money - powerPotion;
		}else if(number == 2 && defensePotion <= money) {
			return money - defensePotion;
		}else if(number == 3 && experiencePotion <= money) {
			return money - experiencePotion;
		}else if(number == 4 && hpPotion <= money) {
			return money - hpPotion;
		}else if(number == 5 && mpPotion <= money) {
			return money - mpPotion;
		}
		return -1;
	}
}
