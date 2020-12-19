import java.util.Scanner;
import Character.*;
import Map.*;

public class Main {
	public static void main(String[] args) { //������ ������ ���� ��� �ִ� �޼���
		Scanner scanner = new Scanner(System.in);
		Hero hero = new Hero();
		System.out.println("___RPG ����___");
		System.out.println("1. ����");
		System.out.println("2. ������");
		System.out.print("������ ��ȣ�� �Է��ϼ��� :");
		int number = scanner.nextInt();
		
		if(number == 1) {
			System.out.println("���簡 ���õǾ����ϴ�.");
			hero = new Warrior();
			hero.defense = 25;
			hero.power = 15;
			hero.level = 1;
			hero.hp = 80;
			hero.mp = 30;
		}else if(number == 2) {
			System.out.println("�����簡 ���õǾ����ϴ�.");
			hero = new Magician();
			hero.defense = 10;
			hero.power = 18;
			hero.level = 1;
			hero.hp = 60;
			hero.mp = 70;
		}
		System.out.print("������ �̸��� �Է��ϼ��� : ");
		hero.name = scanner.next();
		System.out.println("�̸��� �ԷµǾ����ϴ�.");
		System.out.println("���ӿ� �����մϴ�.");
		
		while(true) {
			clearScreen();
			System.out.println("____________________");
			System.out.println("���� ����� �̸� :" + hero.name);
			System.out.println("���� ����� ���� :" + hero.level);
			System.out.println("���� ����� �� :" + hero.power);
			System.out.println("���� ����� ���� :" + hero.defense);
			System.out.println("���� ����� HP :" + hero.hp);
			System.out.println("���� ����� MP :" + hero.mp);
			System.out.println("���� ����� �� :" + hero.money + "���");
			System.out.println("���� ����� ����ġ :" + hero.experience);
			System.out.println("____________________");
			
			System.out.println("1. �����");
			System.out.println("2. ���� ����");
			System.out.println("������ ��Ҹ� �Է��ϼ��� :");
			int number1 = scanner.nextInt();
			
			if(number1 == 1) {
				Monster monster = new Monster();
				clearScreen();
			    System.out.println("����Ϳ� �����Ͽ����ϴ�.");
			    System.out.println("1. ������");
			    System.out.println("2. �鰳");
			    System.out.println("3. ���");
			    System.out.println("4. ��ũ");
			    System.out.print("������ ��븦 �Է��ϼ��� : ");
			    number1 = scanner.nextInt();
			    if(number1 == 1) {
			    	monster = new WildCat();
			        monster.name = "������";
			        monster.hp = 500;
			        monster.mp = 0;
			        monster.level = 5;
			        monster.power = 100;
			        monster.defense = 20;
			        monster.money = 30;
			        monster.experience = 50;
			    }else if(number1 == 2) {
			    	monster = new WildDog();
			        monster.name = "�鰳";
			        monster.hp = 1500;
			        monster.mp = 0;
			        monster.level = 15;
			        monster.power = 300;
			        monster.defense = 30;
			        monster.money = 50;
			        monster.experience = 100;
			    }else if(number1 == 3) {
			    	monster = new WildDog();
			        monster.name = "���";
			        monster.hp = 3000;
			        monster.mp = 0;
			        monster.level = 30;
			        monster.power = 250;
			        monster.defense = 30;
			        monster.money = (int) Math.random() * 1000;
			        monster.experience = 100;
			    }else if(number1 == 4) {
			    	monster = new WildDog();
			        monster.name = "��ũ";
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
			    	System.out.println("������ �����Դϴ�.");
			    	monster.attacked(hero.attack());
			    	if(monster.hp <= 0) {
			    		System.out.println("���Ͱ� �׾����ϴ�.");
			    		hero.experience += monster.experience;
			    		hero.money += monster.money;
			    		break;
			    	}
			    	System.out.println("������ �����Դϴ�.");
			    	hero.attacked(monster.attack());
			    	if(hero.hp <= 0) {
			    		System.out.println("������ �׾����ϴ�.");
			    		hero.hp = 1;
			    		if(hero.hp > 1)
			    			hero.level -= 1;
			    		else{
			    			hero.experience = 0;
			    			hero.money -= 5;
			    		}
			    		System.out.println("������ ü��" + hero.hp +"���� ��Ȱ�߽��ϴ�.");
			    		break;
			    	}
			    }
			}else if(number1 == 2) {
				PotionStore potionStore = new PotionStore();
				clearScreen();
			    System.out.println("���� ������ �����Ͽ����ϴ�.");
			    System.out.println("1. �� ���� ����(100��)");
			    System.out.println("2. ���� ���� ����(100��)");
			    System.out.println("3. ����ġ ���� ����(300��)");
			    System.out.println("4. HP ���� ����(10��)");
			    System.out.println("5. MP ���� ����(10��)");
			    System.out.print("���Ͻô� ������ �Է��ϼ��� : ");
			    number1 = scanner.nextInt();
			    int temp = hero.money;
			    if((hero.money = potionStore.show(hero.money, number1)) != -1)
			    {
			     System.out.println("������ �Ϸ�Ǿ����ϴ�.");
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
			     System.out.println("���� �����մϴ�.");
			     hero.money = temp;
			    }
			}
			if(hero.experience >= hero.level * 100) {
			    hero.level += 1;
			    System.out.println("������ ������ " + hero.level + "�� �Ǿ����ϴ�.");
			    hero.money += hero.level * 50;
			    System.out.println("������ ������� ����" + hero.level * 50 + "�� �����߽��ϴ�.");
			    hero.experience = 0;
		    }
			if(hero.level >= 100)
				break;
		}
	}
	
	public static void clearScreen() { //80���� ���������鼭 ȭ���� û���� �� ���� ȿ���� ��
	    for (int i = 0; i < 80; i++)
	      System.out.println("");
	  }
}
