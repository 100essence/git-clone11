package ch08.sec02;

// interface 선언
public interface RemoteControl {
	// 상수 필드
	int MAX_VOLUME = 10; // public static final 키워드가 생략됨
	int MIN_VOLUME = 0;  // public static final 키워드가 생략됨
	
	// public 추상 메소드(abstract method)-선언만 가능
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
