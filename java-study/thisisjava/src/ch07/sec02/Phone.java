package ch07.sec02;

// 부모 클래스
public class Phone {
	// 필드 2개 선언
	public String model;
	public String color;
	
	public Phone() {
		
	}
	public Phone(String model) {
		this.model = model;
	}
	
	// 메소드 4개 선언
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String message) {
		System.out.println("본인: " + message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	public void inputPhoneNumber(String phoneNumber) {
		System.out.println("전화번호를 입력합니다.");
	}
}
