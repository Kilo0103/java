package Character;

import java.util.Scanner;

public class Warrior extends Hero{
	public float attack() {//�÷��̾��� ����
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("0. �⺻ ���� ( �Ҹ� mp : 00 )");
		System.out.println("1. ������Ʈ ( �Ҹ� mp : 05 )");
		System.out.println("2. ��� ���� ( �Ҹ� mp : 10 )");
		System.out.print("���� ��ȣ�� �Է��ϼ��� :");
		int number = scanner.nextInt();
		
		float sum = 0;
		
		if(number == 0) {
			sum += level * 10;
			sum += power * 15;
			System.out.println("�������� "+ sum + "�Դϴ�.");
			return sum;
		}else if(number == 1) {
			sum += level * 10;
			sum += power * 30;
			mp -= 5;
			System.out.println("�������� "+ sum + "�Դϴ�.");
			return sum;
		}else if(number == 2) {
			sum += level * 20;
			sum += power * 40;
			mp -= 10;
			System.out.println("�������� "+ sum + "�Դϴ�.");
			return sum;
		} else {
			return sum;
		}
	}
}
