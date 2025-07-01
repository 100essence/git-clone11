package ch06.sec07.exam05;

public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car(String model) {
		this(model, "화이트", 220);	// 파라미터가 3개인 생성자 호출
		
	}
	//생성자 선언
	Car(String model, String color) {
		this(model, color, 220);   // 파라미터가 3개인 생성자 호출
	}
	//생성자 선언
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 메소드 선언
	void powerOn() {}	// 리턴값이 없는 메소드 선언
	double divide(int x, int y) { return x / y; }  // double타입 값을 리턴하는 메소드
}
