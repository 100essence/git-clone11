package ch06.sec10.exam00;

// static 정적 관련 예제
public class Calculator {

	// 정적 필드 선언(static -> 타입형태 전에 선언)
	static double pi = 3.14159; 
	
	// 인스턴스 필드 선언
	String color;
	
	// 정적 메소드 선언(static -> 리턴타입형태 전에 선언)
	static int plus(int x, int y) {
		return x + y;
	}
	 
	// 인스턴스 메소드 선언
	void setColor(String color) {
		this.color = color;
	}
}
