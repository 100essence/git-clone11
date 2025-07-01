package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		// 예외처리 하는 코드 추가
		try {
			int result = data.length();	// null 예외 발생할 수 있는 코드
			System.out.println("문자수: " + result);
		} catch(NullPointerException e) {
			// 오류 메시지 출력
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("[마무리 실행]\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n"); 
		printLength("ThisisJava");			  
		printLength(null); 
		System.out.println("[프로그램 종료]\n"); 
	}
}
