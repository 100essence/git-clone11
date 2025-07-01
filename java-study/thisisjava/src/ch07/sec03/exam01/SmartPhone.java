package ch07.sec03.exam01;

public class SmartPhone extends Phone {
	public SmartPhone(String model, String color) {
		// super생성자는 1번만 호출 가능
		//super();			//  생략 가능
		//super(model, color);	// 생략 불가능
//		this.model = model;  // Phone에서 상속받은 model 필드
//		this.color = color;  // Phone에서 상속받은 color 필드
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}
