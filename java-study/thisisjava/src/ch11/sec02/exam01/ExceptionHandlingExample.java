package ch11.sec02.exam01;

public class ExceptionHandlingExample {
	public static void printLength(String data) {
		int result = data.length(); // null 예외 발생할 수 있는 코드
		System.out.println("문자수: " + result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n"); // 출력됨
		printLength("ThisisJava");			  // 출력됨
		printLength(null); // 예외가 발생하면 중단
		System.out.println("[프로그램 종료]\n"); // 출력 안됨
	}
}
