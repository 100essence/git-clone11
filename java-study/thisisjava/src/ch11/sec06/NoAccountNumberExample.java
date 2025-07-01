package ch11.sec06;

public class NoAccountNumberExample extends RuntimeException {
	public NoAccountNumberExample() {
		
	}
	
	public NoAccountNumberExample(String message) {
		super(message);
	}
}
