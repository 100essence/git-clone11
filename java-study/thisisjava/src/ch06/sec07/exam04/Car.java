package ch06.sec07.exam04;

public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car() {
		//this("k3", "검은색", 210);
		System.out.println("Car()실행됨");
	}
	//생성자 선언
	Car(String model) {
		//this(model, "화이트", 220);
		this.model = model; 
		System.out.println("Car(String model)실행됨");
	}
	//생성자 선언
	Car(String model, String color) {
		//this(model, color, 220);
		this.model = model;
		this.color = color;
		System.out.println("Car(String model, String color)실행됨");
	}
	//생성자 선언
	Car(String model, String color, int maxSpeed) {
		System.out.println("Car(String model, String color, int maxSpeed)실행됨");
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
