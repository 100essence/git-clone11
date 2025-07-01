package ch06.sec06.exam00;

// 자동차 클래스
public class Car {
	// 필드 선언(생성) -> 명사형을 많이 사용
	String color = "red"; // 고유 필드
	
	// 고유 필드
	String company;
	String model = "그랜저";
	int maxSpeed;
	int minSpeed;
	
	// 부품 필드
	Body body = new Body();
	Engine engine = null;
	Tire tire;
	
	// 장비 필드
	Wiper wiper;
	
	// 생성자...
	Car() {
		speed = 60;
	}
	
	// 메소드
	void method_one() {
		color = "black";
	}
	// 메소드
	void method() {
		// 자기 자신의 Car객체 생성
		Car myCar = new Car();
		// Car객체 외부에서 필드 값을 대입
		myCar.speed = 60;
		speed = 60;
	}
	
	int speed;  // 상태 필드
}

class Wiper {
	
}

class Body {
	
}

class Engine {

}

class Tire {

}
