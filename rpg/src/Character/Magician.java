package Character;

import java.util.Scanner;

public class Magician extends Hero{
	public float attack() { //�÷��̾��� ����
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("0. �⺻ ���� ( �Ҹ� mp : 00 )");
		System.out.println("1. �� ���� ( �Ҹ� mp : 10 )");
		System.out.println("2. �� ��ź ( �Ҹ� mp : 15 )");
		System.out.print("���� ��ȣ�� �Է��ϼ��� :");
		int number = scanner.nextInt();
		
		float sum = 0;
		
		if(number == 0) {
			sum += level * 5;
			sum += power * 10;
			System.out.println("�������� "+ sum + "�Դϴ�.");
			return sum;
		}else if(number == 1) {
			sum += level * 7;
			sum += power * 35;
			mp -= 10;
			System.out.println("�������� "+ sum + "�Դϴ�.");
			return sum;
		}else if(number == 2) {
			sum += level * 10;
			sum += power * 48;
			mp -= 15;
			System.out.println("�������� "+ sum + "�Դϴ�.");
			return sum;
		} else {
			return sum;
		}
	}
}
