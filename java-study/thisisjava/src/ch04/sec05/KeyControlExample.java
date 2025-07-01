package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;  // 처음 속도는 0
		
		// while 무한루프
		while(run) {
			// 메뉴 안내 메시지
			System.out.println("-----------------------------");
			System.out.println("1.증속 | 2.감속 | 3.중지");
			System.out.println("-----------------------------");
			System.out.print("선택: ");
			
			String strNum = scanner.nextLine();  // 키보드로 입력한 값이 strNum변수에 대입
			if(strNum.equals("1")) { 						// 증속일 때
				speed++;
				System.out.println("현재 속도 = " + speed);		
			} else if (strNum.equals("2")) {				// 감속일 때
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if (strNum.equals("3")) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
