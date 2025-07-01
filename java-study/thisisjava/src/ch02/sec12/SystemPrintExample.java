package ch02.sec12;

public class SystemPrintExample {

	public static void main(String[] args) {
		// System.out.print(리터럴 또는 변수)
		System.out.printf("이름: %s \n", "김자바");
		System.out.printf("나이: %d \n", 25);
		System.out.printf("몸무게: %8.2f \n", 65.5);   // 정수 5자리 + 소수점 1자리(.) + 소수 2자리 = 총 8자리
		
		System.out.printf("이름: %s, 나이: %6s, 몸무게: %8.1f \n", "김자바", 250, 65.5);
		
		  
	}

}
