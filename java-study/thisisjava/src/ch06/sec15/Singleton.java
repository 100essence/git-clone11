package ch06.sec15;

// 싱글톤(singleton) 패턴 학습 예제
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	// 외부에서 new 객체를 호출할 수 없도록 막기
	private Singleton() {}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
