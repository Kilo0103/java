import java.util.Scanner;
import Character.*;
import Map.*;

public class Main {
	public static void main(String[] args) { //게임의 메인을 전부 담고 있는 메서드
		Scanner scanner = new Scanner(System.in);
		Hero hero = new Hero();
		System.out.println("___RPG 게임___");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
		System.out.print("직업의 번호를 입력하세요 :");
		int number = scanner.nextInt();
		
		if(number == 1) {
			System.out.println("전사가 선택되었습니다.");
			hero = new Warrior();
			hero.defense = 25;
			hero.power = 15;
			hero.level = 1;
			hero.hp = 80;
			hero.mp = 30;
		}else if(number == 2) {
			System.out.println("마법사가 선택되었습니다.");
			hero = new Magician();
			hero.defense = 10;
			hero.power = 18;
			hero.level = 1;
			hero.hp = 60;
			hero.mp = 70;
		}
		System.out.print("영웅의 이름을 입력하세요 : ");
		hero.name = scanner.next();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장합니다.");
		
		while(true) {
			clearScreen();
			System.out.println("____________________");
			System.out.println("현재 당신의 이름 :" + hero.name);
			System.out.println("현재 당신의 레벨 :" + hero.level);
			System.out.println("현재 당신의 힘 :" + hero.power);
			System.out.println("현재 당신의 방어력 :" + hero.defense);
			System.out.println("현재 당신의 HP :" + hero.hp);
			System.out.println("현재 당신의 MP :" + hero.mp);
			System.out.println("현재 당신의 돈 :" + hero.money + "골드");
			System.out.println("현재 당신의 경험치 :" + hero.experience);
			System.out.println("____________________");
			
			System.out.println("1. 사냥터");
			System.out.println("2. 포션 상점");
			System.out.println("입장할 장소를 입력하세요 :");
			int number1 = scanner.nextInt();
			
			if(number1 == 1) {
				Monster monster = new Monster();
				clearScreen();
			    System.out.println("사냥터에 입장하였습니다.");
			    System.out.println("1. 살쾡이");
			    System.out.println("2. 들개");
			    System.out.println("3. 고블린");
			    System.out.println("4. 오크");
			    System.out.print("전투할 상대를 입력하세요 : ");
			    number1 = scanner.nextInt();
			    if(number1 == 1) {
			    	monster = new WildCat();
			        monster.name = "살쾡이";
			        monster.hp = 500;
			        monster.mp = 0;
			        monster.level = 5;
			        monster.power = 100;
			        monster.defense = 20;
			        monster.money = 30;
			        monster.experience = 50;
			    }else if(number1 == 2) {
			    	monster = new WildDog();
			        monster.name = "들개";
			        monster.hp = 1500;
			        monster.mp = 0;
			        monster.level = 15;
			        monster.power = 300;
			        monster.defense = 30;
			        monster.money = 50;
			        monster.experience = 100;
			    }else if(number1 == 3) {
			    	monster = new WildDog();
			        monster.name = "고블린";
			        monster.hp = 3000;
			        monster.mp = 0;
			        monster.level = 30;
			        monster.power = 250;
			        monster.defense = 30;
			        monster.money = (int) Math.random() * 1000;
			        monster.experience = 100;
			    }else if(number1 == 4) {
			    	monster = new WildDog();
			        monster.name = "오크";
			        monster.hp = (float) ((Math.random() * 3750) + 10000);
			        monster.mp = 0;
			        monster.level = 57;
			        monster.power = 500;
			        monster.defense = 75;
			        monster.money = 50;
			        monster.experience = 100;
			    }
			    else {
			    	break;
			    }
			    while(true) {
			    	System.out.println("영웅의 공격입니다.");
			    	monster.attacked(hero.attack());
			    	if(monster.hp <= 0) {
			    		System.out.println("몬스터가 죽었습니다.");
			    		hero.experience += monster.experience;
			    		hero.money += monster.money;
			    		break;
			    	}
			    	System.out.println("몬스터의 공격입니다.");
			    	hero.attacked(monster.attack());
			    	if(hero.hp <= 0) {
			    		System.out.println("영웅이 죽었습니다.");
			    		hero.hp = 1;
			    		if(hero.hp > 1)
			    			hero.level -= 1;
			    		else{
			    			hero.experience = 0;
			    			hero.money -= 5;
			    		}
			    		System.out.println("영웅이 체력" + hero.hp +"으로 부활했습니다.");
			    		break;
			    	}
			    }
			}else if(number1 == 2) {
				PotionStore potionStore = new PotionStore();
				clearScreen();
			    System.out.println("포션 상점에 입장하였습니다.");
			    System.out.println("1. 힘 증강 포션(100원)");
			    System.out.println("2. 방어력 증강 포션(100원)");
			    System.out.println("3. 경험치 증강 포션(300원)");
			    System.out.println("4. HP 증강 포션(10원)");
			    System.out.println("5. MP 증강 포션(10원)");
			    System.out.print("원하시는 물건을 입력하세요 : ");
			    number1 = scanner.nextInt();
			    int temp = hero.money;
			    if((hero.money = potionStore.show(hero.money, number1)) != -1)
			    {
			     System.out.println("구입이 완료되었습니다.");
			     if(number1 == 1)
			      hero.power += 3;
			     if(number1 == 2)
			      hero.defense += 3;
			     if(number1 == 3)
			      hero.experience += 50;
			     if(number1 == 4)
			      hero.hp += 50;
			     if(number1 == 5)
			      hero.mp += 50;
			    }
			    else
			    {
			     System.out.println("돈이 부족합니다.");
			     hero.money = temp;
			    }
			}
			if(hero.experience >= hero.level * 100) {
			    hero.level += 1;
			    System.out.println("영웅의 레벨이 " + hero.level + "이 되었습니다.");
			    hero.money += hero.level * 50;
			    System.out.println("레벨업 기념으로 돈이" + hero.level * 50 + "원 증가했습니다.");
			    hero.experience = 0;
		    }
			if(hero.level >= 100)
				break;
		}
	}
	
	public static void clearScreen() { //80줄을 내려버리면서 화면을 청소한 것 같은 효과를 줌
	    for (int i = 0; i < 80; i++)
	      System.out.println("");
	  }
}
