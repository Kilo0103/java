package Map;

public class PotionStore extends Map{
	int powerPotion = 100;
	int defensePotion = 100;
	int experiencePotion = 300;
	int hpPotion = 10;
	int mpPotion = 10;
	
	public int show (int money, int number) { //���� ���� ���ſ� ���� ó�� ���� �ִٸ� ���� ���ٸ� �Ұ���
		name = "���� ����";
		System.out.println(name+"���� ������ ���� �õ��ϴ� ���Դϴ�.");
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
