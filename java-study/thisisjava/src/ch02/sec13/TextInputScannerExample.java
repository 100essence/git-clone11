package ch02.sec13;

import java.util.Scanner;

public class TextInputScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // 콘솔에 데이터를 입력받기 위한 객체 생성
		
		System.out.print("x 값 입력(숫자만 가능(만약 숫자가 아닐시 정상적으로 동작하지 않습니다.))(숫자는 21억 이내의 숫자만): ");
		String strX = scanner.nextLine();  // 입력을 받기 위해 엔터를 치기 전까지의 입력값을 받을 때까지 대기(엔터를 치기 전까지 아래 코드 중단)		
		int x = Integer.parseInt(strX);
		
		System.out.print("y 값 입력(숫자만 가능(만약 숫자가 아닐시 정상적으로 동작하지 않습니다.)(숫자는 21억 이내의 숫자만): ");
		String strY = scanner.nextLine();  // 입력을 받기 위해 엔터를 치기 전까지의 입력값을 받을 때까지 대기(엔터를 치기 전까지 아래 코드 중단)
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y = " + result);
		System.out.println("프로그램 종료");
	}

}
