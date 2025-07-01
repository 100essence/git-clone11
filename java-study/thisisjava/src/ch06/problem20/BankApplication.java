package ch06.problem20;

import java.util.Scanner;

public class BankApplication {
	// 필드
	private static Scanner scanner = new Scanner(System.in);
	private static Account[] accountArray = new Account[100];
	
	// 실행 메소드
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			Integer selectNumber = Integer.parseInt(scanner.nextLine());
			
			switch(selectNumber) {
				case 1:				// 1. 계좌생성
					if(createAccount()) {
						System.out.println("결과: 계좌가 생성되었습니다");
					} else {
						System.out.println("결과: 계좌 생성에 실패하였습니다");
					}
					break;
				case 2:				// 2. 계좌목록
					printAccountList();
					break;
				case 3:
					if(deposit()) {		// 3. 계좌예금
						System.out.println("결과: 예금이 성공적으로 되었습니다");
					} else {
						System.out.println("결과: 예금이 실패되었습니다");
					}
				case 4:
					if(withdraw()) {		// 4. 계좌출금
						System.out.println("결과: 출금이 성공적으로 되었습니다");
					} else {
						System.out.println("결과: 출금이 실패되었습니다");
					}
				case 5:				// 5. 종료
					run = false;
					break;
			}
			
		}
		
		scanner.close();
		System.out.println("프로그램 종료");
	}
	
	// 각각의 기능 메소드
	// 1. 계좌생성 메소드
	private static boolean createAccount() {
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		
		System.out.print("계좌번호: ");
		String accountNumber = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String accountName = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		long balance = Long.parseLong(scanner.nextLine());
		
		Account newAccount = new Account(accountNumber, accountName, balance);
		boolean isOk = false;
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				isOk = true;
				break;
			}
		}
		return isOk;
	}
	
	// 2. 계좌목록 출력 메소드
	private static void printAccountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				System.out.println(
					accountArray[i].getAccountNumber() + "\t" + 
					accountArray[i].getAccountName() + "\t" + 
					accountArray[i].getBalance()
				);
			}
		}
	}
	
	// 3. 계좌예금 메소드
	private static boolean deposit() {
		boolean isOk = false;
		
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		
		System.out.print("계좌번호: ");
		String accountNumber = scanner.nextLine();
		System.out.print("예금액: ");
		long accountBalance = Long.parseLong(scanner.nextLine());
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null 
					&& accountArray[i].getAccountNumber().equals(accountNumber)) {
				// 기존 금액
				long currentBalance = accountArray[i].getBalance();
				// 기존 금액 + 입력받은 예금액
				accountArray[i].setBalance(currentBalance + accountBalance);
				isOk = true;
				
				break;
			}
		}
		
		return isOk;
	}
	
	// 4. 계좌출금 메소드
	private static boolean withdraw() {
		boolean isOk = false;
		
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		
		System.out.print("계좌번호: ");
		String accountNumber = scanner.nextLine();
		System.out.print("출금액: ");
		long accountBalance = Long.parseLong(scanner.nextLine());
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null 
					&& accountArray[i].getAccountNumber().equals(accountNumber)) {
				// 기존 금액
				long currentBalance = accountArray[i].getBalance();
				// 기존 금액 + 입력받은 예금액
				accountArray[i].setBalance(currentBalance - accountBalance);
				isOk = true;
				
				break;
			}
		}
		
		return isOk;
	}
	
	// 개선사항 리스트 -> 계좌 관리 고도화
	//   1. 계좌 삭제(해지)
	//   2. 동일한 계좌 입력시 어떻게 안내를 할 건지...
	//   3. 특정한 계좌 검색 및 조회
	//   4. 계좌간의 이체 기능
	//   5. 계좌간의 출금, 예금, 이체에 대한 히스토리 조회 기능
	//   6. 금액을 음수 혹은 비정상 금액이 되었을 시 예외처리를 어떻게 할건지...
	//   7. 메뉴 선택하는데 있어서 유효성 검사 -> 숫자 이외의 메뉴 값을 입력할 경우 어떻게 예외처리 할건지...
	//   8. 이자 계산
	//       (1) 정기 이자 지급
	//       (2) 이자에 대한 세금처리
	//   9. 수수료 부과
	//       (1) 출금에 대한 수수료
	//       (2) 이체에 대한 수수료
	//   10. 비밀번호 기능
	//   11. 사용자 권한 및 역할 분리
	//   12. 다중 통화 지원(원화, 달러 환율)
	//   ...
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
}
