package ch11.sec01;

import java.lang.*;

// Throwable
// Exception, ClassNotFoundException...
// Error
public class ExceptionExample1 {
	Throwable a;
	Exception b;
	ClassNotFoundException c;
	Error d;
	
	public static void main(String[] args) {
		// 예외처리가 났을 경우 처리하는 문법
	
		try {
			// 실행문1
			// 실행문2
			// ...	
			System.out.println("try Hello World");	
			
			double a = 1 / 0;  // 0으로 나누는 예외가 발생
		} catch(Exception e) {
			System.out.println("Exception Hello World");
		} finally { // finally는 생략 가능
			System.out.println("finally Hello World");
		}
	}
}
