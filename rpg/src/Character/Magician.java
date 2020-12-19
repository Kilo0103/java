package Character;

import java.util.Scanner;

public class Magician extends Hero{
	public float attack() { //플레이어의 공격
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("0. 기본 공격 ( 소모 mp : 00 )");
		System.out.println("1. 불 지옥 ( 소모 mp : 10 )");
		System.out.println("2. 물 폭탄 ( 소모 mp : 15 )");
		System.out.print("공격 번호를 입력하세요 :");
		int number = scanner.nextInt();
		
		float sum = 0;
		
		if(number == 0) {
			sum += level * 5;
			sum += power * 10;
			System.out.println("데미지는 "+ sum + "입니다.");
			return sum;
		}else if(number == 1) {
			sum += level * 7;
			sum += power * 35;
			mp -= 10;
			System.out.println("데미지는 "+ sum + "입니다.");
			return sum;
		}else if(number == 2) {
			sum += level * 10;
			sum += power * 48;
			mp -= 15;
			System.out.println("데미지는 "+ sum + "입니다.");
			return sum;
		} else {
			return sum;
		}
	}
}
