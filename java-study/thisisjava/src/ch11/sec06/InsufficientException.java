package ch11.sec06;

// 사용자 정의 예외클래스
public class InsufficientException extends RuntimeException {
	public InsufficientException() {
		
	}
	
	public InsufficientException(String message) {
		super(message);
	}
}
