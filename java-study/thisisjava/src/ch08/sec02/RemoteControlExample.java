package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc1 = null;
		RemoteControl rc2 = new Television();
		rc2.turnOn();	// TV를 켭니다.
		RemoteControl rc3 = new Audio();
		rc3.turnOn();	// Audio를 켭니다.
		
		rc2 = new Audio();
		rc2.turnOn();	// Audio를 켭니다.
		
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		
		// 인터페이스 변수 선언
		RemoteControl rc;
		
		//Televison 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
