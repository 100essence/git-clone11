package ch07.sec03.exam01;

//부모 클래스
public class Phone {
	// 필드 2개 선언
	public String model;
	public String color;
	
	public Phone() {
		System.out.println("Phone() 생성자 실행");
	}
	
	public Phone(String model, String color) {
		this.model = model; 
		this.color = color;  
		System.out.println("Phone(String model, String color) 생성자 실행됨");
	}
}
