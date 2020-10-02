import java.util.Scanner;

public class AppMain {
	
	public static void main(String[] args) {
		
		Student std = new Student(); // 클래스 Student에 있는 변수와 메소드를 이용하기 위해 인스턴스 생성
		String mname = null; // 이름에 대한 변수 ; 형태 초시 값
		int mnumber = 0;	 // 학번에 대한 변수 ; 형태 초기 값
		
		std.getter(mname, mnumber); //Student.getter(mname, mnumber);와 비슷한 표현 / 클래스 Student에 있는 메소드 getter를 호출
	}
}

class Student{
	static String name; // 이름을 저장할 멤버 변수
	static int number;  // 학번을 저장할 멤버 변수

	
	void getter(String name, int num) {
		Scanner scan = new Scanner(System.in); // Scanner사용하기 위한 약어와 인스턴스 생성
		System.out.println(" 이름 : ");
		name = scan.nextLine();				   // 이름을 인수에 입력
		System.out.println("학번 : ");
		num = scan.nextInt();				   // 학번을 인수에 입력
		scan.close();						   // Scanner 사용 중지 선언으로 리소스 누출에러 방지
		setter(name, num);					   // setter 메소드 호출
		printer();							   // printer 메소드 호출
	}
	
	static void setter(String n, int nm) {
		name = n;		// 인수에 저장된 이름을 불러와 멤버 변수에 저장
		number = nm;	// 인수에 저장된 학번을 불러와 멤버 변수에 저장
	}
	
	void printer() {
		System.out.println("학번 : " + number + " 이름 : " + name);
	}
}
