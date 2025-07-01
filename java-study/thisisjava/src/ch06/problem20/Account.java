package ch06.problem20;

public class Account {
	// 필드
	private String accountNumber;  // 계좌번호
	private String accountName;	   // 계좌주
	private long balance;		   // 잔액
	
	// 생성자
	public Account(
			String accountNumber, 
			String accountName, 
			long balance
	) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	// 메소드
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
