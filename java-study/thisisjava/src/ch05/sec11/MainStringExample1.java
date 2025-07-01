package ch05.sec11;

public class MainStringExample1 {

	public static void main(String[] args) {
		// String[] args 용도 확인하기
		System.out.println(args.length);
		
		if(args.length != 2) {
			System.out.println("프로그램 입력 값이 부족");
			System.exit(0);		// 프로그램 정상 종료해주는 코드
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
