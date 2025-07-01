package ch04.exercise;

import java.util.Scanner; 

public class Problem7 {

	public static void main(String[] args) {
		boolean run = true;
		
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		
		while(run) {
			// 메뉴 안내 메시지
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택: ");
			
			String strNum = scanner.nextLine();
			
			if (strNum.equals("1")) { // 예금
				System.out.print("예금액> ");
				
				int temp = Integer.parseInt(scanner.nextLine());
				balance = balance + temp; 
			} else if (strNum.equals("2")) { // 출금
				System.out.print("출금액> ");
				
				int temp = Integer.parseInt(scanner.nextLine());
				balance = balance - temp; 
			} else if (strNum.equals("3")) { // 잔고
				System.out.println("잔고> " + balance); 
			} else if (strNum.equals("4")) { // 종료
				run = false;
			}
		}
		
		System.out.print("프로그램 종료"); 
	}

}
