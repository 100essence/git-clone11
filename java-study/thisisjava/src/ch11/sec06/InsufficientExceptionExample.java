package ch11.sec06;

public class InsufficientExceptionExample {

	public InsufficientExceptionExample() throws Exception {
		
	}
	
	public static void main(String[] args) {
		try {
			if (true)
				throw new InsufficientException("잔고부족 에러입니다.");
			else
				throw new NoAccountNumberExample("수신계좌는 없는 계좌입니다.");
		} catch(InsufficientException e) {
			System.out.println("catch(InsufficientException): " + e.getMessage());
		} catch(NoAccountNumberExample e) {
			System.out.println("catch(NoAccountNumberExample): " + e.getMessage());
		} 
		
	}

}
