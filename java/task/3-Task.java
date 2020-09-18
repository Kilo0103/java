import java.util.Scanner;

public class AppMain {
	public static void main(String... args) {
		/**
		 * 구구단을 제작하는 알고리즘
		 */
		int[] multiple = {2, 3, 4, 5, 6, 7, 8, 9}; // 구구단의 몇 단 부분을 담당
		for(int a : multiple) {
			System.out.print("[" + a + "단]	"); // 첫 줄을 미리 생성
		}
		System.out.print("\n");
		for(int i = 1 ; i < 10 ; i++) {	//아래의 한 줄 씩 생성하는 것을 9번 반복
			for(int b : multiple) {		//한 줄 씩 생성
				System.out.print(i + "*" + b + "=" + i*b);
				System.out.print("	");
			}
			System.out.print("\n");
		}
		System.out.print("\n\n"); // 별모양 출력을 위한 공간 마련
		
		/**
		 * 별모양 생성을 위한 알고리즘
		 */
		
		Scanner num = new Scanner(System.in); //입력 버퍼 확인
		System.out.print("몇 줄을 출력하시겠습니까?");
		int ln = num.nextInt();
		
		for(int i = 1 ; i <= 4 ; i++) {
			System.out.print("[" + i + "번]	"); // 첫 줄을 생성
		}
		
		System.out.print("\n");


		for(int i = 0 ; i < ln ; i++) {
			for(int a = 0 ; a <= i ; a++) {   //1번 별 시작
				System.out.print("*");
			} 
			System.out.print("	");		      //별찍기 사이 공간 비우기
			for(int b = ln-1 ; b >= i ; b--) {//2번 별 시작
				System.out.print("*");
			} 
			System.out.print("	");		      //별찍기 사이 공간 비우기
			
			for(int c = ln-1 ; c > i ; c--) { //3번 별 시작
				System.out.print(" ");
			} 
			for(int cC = 0 ; cC <= i ; cC++) {
				System.out.print("*");
			} System.out.print("	");		    //별찍기 사이 공간 비우기
			for(int d = 0 ; d < i ; d++) {    //4번 별 시작
				System.out.print(" ");
			}
			for(int dD = ln-1 ; dD >= i ; dD--) {
				System.out.print("*");
			}
			System.out.println(); //줄의 끝자락
		}
		
		
	}
}
